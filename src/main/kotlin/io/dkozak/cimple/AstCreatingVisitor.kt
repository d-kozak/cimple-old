package io.dkozak.cimple

class AstCreatingVisitor : CimpleBaseVisitor<AstNode>() {

    private val symbolTable: MutableMap<String, VariableReference> = mutableMapOf()

    override fun visitProgram(ctx: CimpleParser.ProgramContext): AstNode {
        val nodes = ctx.statement()
                .map { it.accept(this) }
        return Program(nodes)
    }

    override fun visitStatement(ctx: CimpleParser.StatementContext): AstNode = ctx.getChild(0).accept(this) // ignore SEMICOLON

    override fun visitVariableAssignment(ctx: CimpleParser.VariableAssignmentContext): AstNode {
        val reference = symbolTable.computeIfAbsent(ctx.ID().text) { VariableReference(ctx.ID().text) }
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        return VariableAssignment(reference, expression)
    }

    override fun visitInputStatement(ctx: CimpleParser.InputStatementContext): AstNode {
        val reference = symbolTable.computeIfAbsent(ctx.ID().text) { VariableReference(ctx.ID().text) }
        return InputStatement(reference)
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