package io.dkozak.cimple

class ExpressionAstCreatingVisitor(
        val symbolTable: Map<String, VariableReference>
) : CimpleBaseVisitor<Expression>() {

    override fun visitVarExpr(ctx: CimpleParser.VarExprContext): Expression = symbolTable[ctx.text]
            ?: UnresolvedVariableReference(ctx.text)

    override fun visitIntConstant(ctx: CimpleParser.IntConstantContext): Expression = IntegerLiteral(ctx.text.toInt())

    override fun visitBracketExpr(ctx: CimpleParser.BracketExprContext): Expression = ctx.expr.accept(this)

    override fun visitBinExpr(ctx: CimpleParser.BinExprContext): Expression = when (ctx.children[1].text) {
        "+" -> BinaryExpression("+", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "-" -> BinaryExpression("-", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "*" -> BinaryExpression("*", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "/" -> BinaryExpression("/", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "mod" -> BinaryExpression("mod", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        else -> UnresolvedBinaryExpression(ctx.children[1].text, ctx.expression(0).accept(this), ctx.expression(1).accept(this))
    }

    override fun visitLogExpr(ctx: CimpleParser.LogExprContext): Expression = when (ctx.children[1].text) {
        "==" -> BinaryExpression("==", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "!=" -> BinaryExpression("!=", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "<" -> BinaryExpression("<", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        "<=" -> BinaryExpression("<=", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        ">" -> BinaryExpression(">", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        ">=" -> BinaryExpression(">=", ctx.expression(0).accept(this), ctx.expression(1).accept(this))
        else -> UnresolvedBinaryExpression(ctx.children[1].text, ctx.expression(0).accept(this), ctx.expression(1).accept(this))
    }
}
