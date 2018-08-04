package io.dkozak.cimple

class AstCreatingVisitor : CimpleBaseVisitor<AstNode>() {

    val symbolTable = SymbolTable()

    override fun visitProgram(ctx: CimpleParser.ProgramContext): AstNode {
        val nodes = ctx.statement()
                .map { it.accept(this) }
        return Program(nodes)
    }

    override fun visitFunctionDefinition(ctx: CimpleParser.FunctionDefinitionContext): AstNode {
        val name = ctx.ID().text
        val params = if (ctx.parameters() != null)
            ctx.parameters().ID().map { VariableReference(it.text) }
        else emptyList()

        val functionDefinition = FunctionDefinition(name, params)
        symbolTable.put(name, functionDefinition)

        symbolTable.push()
        for (param in params) {
            symbolTable.put(param.name, VariableSymbol(param))
        }
        val statements = ctx.block().statement().map {
            it.accept(this)
        }
        symbolTable.pop()
        functionDefinition.body = statements
        return functionDefinition
    }

    override fun visitFunctionCall(ctx: CimpleParser.FunctionCallContext): AstNode {
        val symbol = symbolTable.get(ctx.ID().text)
        return if (symbol is FunctionDefinition) {
            val arguments = if (ctx.arguments() != null) {
                ctx.arguments().expression()
                        .map {
                            ExpressionAstCreatingVisitor(symbolTable)
                                    .visit(it)
                        }
            } else listOf()
            FunctionCall(symbol, arguments)
        } else {
            TODO("Handle semantic error")
        }
    }

    override fun visitReturnStatement(ctx: CimpleParser.ReturnStatementContext): AstNode = ReturnStatement(ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression()))

    override fun visitStatement(ctx: CimpleParser.StatementContext): AstNode = ctx.getChild(0).accept(this) // ignore SEMICOLON

    override fun visitVariableAssignment(ctx: CimpleParser.VariableAssignmentContext): AstNode {
        val reference = symbolTable.computeIfAbsent(ctx.ID().text) { VariableSymbol(VariableReference(ctx.ID().text)) }
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        if (reference is VariableSymbol)
            return VariableAssignment(reference.variableReference, expression)
        else {
            TODO("handle sematic error")
        }
    }

    override fun visitInputStatement(ctx: CimpleParser.InputStatementContext): AstNode {
        val reference = symbolTable.computeIfAbsent(ctx.ID().text) { VariableSymbol(VariableReference(ctx.ID().text)) }
        if (reference is VariableSymbol)
            return InputStatement(reference.variableReference)
        else {
            TODO("handle sematic error")
        }

    }

    override fun visitPrintStatement(ctx: CimpleParser.PrintStatementContext): AstNode = PrintStatement(
            ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
    )


    override fun visitIf(ctx: CimpleParser.IfContext): AstNode {
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        val block = ctx.block().statement().map { it.accept(this) }
        return IfStatement(expression, block, emptyList())
    }

    override fun visitIfElse(ctx: CimpleParser.IfElseContext): AstNode {
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        val thenBlock = ctx.block(0).statement().map { it.accept(this) }
        val elseBlock = ctx.block(1).statement().map { it.accept(this) }
        return IfStatement(expression, thenBlock, elseBlock)
    }

    override fun visitForLoop(ctx: CimpleParser.ForLoopContext): AstNode {
        val setup = ctx.setup.accept(this) as VariableAssignment
        val testExpression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        val increment = ctx.increment.accept(this) as VariableAssignment
        val statements = ctx.block().statement().map { it.accept(this) }
        return ForLoop(setup, testExpression, statements, increment)
    }
}