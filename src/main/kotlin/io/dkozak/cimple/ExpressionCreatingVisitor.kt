package io.dkozak.cimple

class ExpressionAstCreatingVisitor(
        private val symbolTable: Map<String, VariableReference>
) : CimpleBaseVisitor<Expression>() {

    override fun visitVarExpr(ctx: CimpleParser.VarExprContext): Expression {
        val variable = symbolTable[ctx.text]
                ?: UnresolvedVariableReference(ctx.text)
        return if (ctx.MINUS() != null) UnaryExpression(Operation.MINUS, variable) else variable
    }

    override fun visitIntConstant(ctx: CimpleParser.IntConstantContext): Expression =
            if (ctx.MINUS() != null) UnaryExpression(Operation.MINUS, IntegerLiteral(ctx.text.toInt()))
            else IntegerLiteral(ctx.text.toInt())

    override fun visitNotExpr(ctx: CimpleParser.NotExprContext): Expression = UnaryExpression(Operation.NOT, ctx.expression().accept(this))

    override fun visitBracketExpr(ctx: CimpleParser.BracketExprContext): Expression = ctx.expression().accept(this)

    override fun visitBinExpr(ctx: CimpleParser.BinExprContext): Expression = when (ctx.children[1].text) {
        "+" -> createBinaryExpression(Operation.PLUS, ctx)
        "-" -> createBinaryExpression(Operation.MINUS, ctx)
        "*" -> createBinaryExpression(Operation.MULT, ctx)
        "/" -> createBinaryExpression(Operation.DIV, ctx)
        "mod" -> createBinaryExpression(Operation.MOD, ctx)
        "==" -> createBinaryExpression(Operation.EQUALS, ctx)
        "!=" -> createBinaryExpression(Operation.NOT_EQUALS, ctx)
        "<" -> createBinaryExpression(Operation.LT, ctx)
        "<=" -> createBinaryExpression(Operation.LE, ctx)
        ">" -> createBinaryExpression(Operation.GT, ctx)
        ">=" -> createBinaryExpression(Operation.GE, ctx)
        "and" -> createBinaryExpression(Operation.AND, ctx)
        "or" -> createBinaryExpression(Operation.OR, ctx)
        else -> UnresolvedBinaryExpression(ctx.children[1].text, ctx.expression(0).accept(this), ctx.expression(1).accept(this))
    }

    private fun createBinaryExpression(operation: Operation, ctx: CimpleParser.BinExprContext) = BinaryExpression(operation, ctx.expression(0).accept(this), ctx.expression(1).accept(this))

}
