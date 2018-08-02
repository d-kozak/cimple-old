package io.dkozak.cimple

class AstCreatingVisitor : CimpleBaseVisitor<AstNode>() {

    val symbolTable: MutableMap<String, VariableReference> = mutableMapOf()

    override fun visitProgram(ctx: CimpleParser.ProgramContext): AstNode {
        val nodes = ctx.statement()
                .map { it.accept(this) }
        return Program(nodes)
    }

    override fun visitVariableAssignment(ctx: CimpleParser.VariableAssignmentContext): AstNode {
        val reference = symbolTable.computeIfAbsent(ctx.ID().text) { VariableReference(ctx.ID().text) }
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        return VariableAssignment(reference, expression)
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
}