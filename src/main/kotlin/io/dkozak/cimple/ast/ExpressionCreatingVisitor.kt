package io.dkozak.cimple.ast

import io.dkozak.cimple.CimpleBaseVisitor
import io.dkozak.cimple.CimpleParser

class ExpressionAstCreatingVisitor(
        val errors: MutableList<String>
) : CimpleBaseVisitor<Expression>() {


    override fun visitFunctionCall(ctx: CimpleParser.FunctionCallContext): Expression =
            UnresolvedFunctionCall(
                    ctx.ID().text,
                    ctx.arguments()?.expression()?.map(this::visit) ?: emptyList()
            )

    override fun visitVarExpr(ctx: CimpleParser.VarExprContext): Expression =
            UnresolvedVariableReference(ctx.text).let {
                if (ctx.MINUS() != null) UnaryExpression(Operation.MINUS, it) else it
            }


    override fun visitDoubleConstant(ctx: CimpleParser.DoubleConstantContext): Expression =
            if (ctx.MINUS() != null) UnaryExpression(Operation.MINUS, DoubleLiteral(ctx.DOUBLE().text.toDouble()))
            else DoubleLiteral(ctx.text.toDouble())

    override fun visitStringConstant(ctx: CimpleParser.StringConstantContext): Expression = StringLiteral(ctx.text.substring(1, ctx.text.length - 1))

    override fun visitIntConstant(ctx: CimpleParser.IntConstantContext): Expression =
            if (ctx.MINUS() != null) UnaryExpression(Operation.MINUS, IntegerLiteral(ctx.INT().text.toInt()))
            else IntegerLiteral(ctx.text.toInt())

    override fun visitNotExpr(ctx: CimpleParser.NotExprContext): Expression = UnaryExpression(Operation.NOT, ctx.expression().accept(this))

    override fun visitBracketExpr(ctx: CimpleParser.BracketExprContext): Expression = ctx.expression().accept(this)

    override fun visitBinExpr(ctx: CimpleParser.BinExprContext): Expression = when (ctx.children[1].text) {
        "+" -> createBinaryExpression(Operation.PLUS, ctx)
        "-" -> createBinaryExpression(Operation.MINUS, ctx)
        "*" -> createBinaryExpression(Operation.MULT, ctx)
        "/" -> createBinaryExpression(Operation.DIV, ctx)
        "%" -> createBinaryExpression(Operation.MOD, ctx)
        "==" -> createBinaryExpression(Operation.EQUALS, ctx)
        "!=" -> createBinaryExpression(Operation.NOT_EQUALS, ctx)
        "<" -> createBinaryExpression(Operation.LT, ctx)
        "<=" -> createBinaryExpression(Operation.LE, ctx)
        ">" -> createBinaryExpression(Operation.GT, ctx)
        ">=" -> createBinaryExpression(Operation.GE, ctx)
        "and" -> createBinaryExpression(Operation.AND, ctx)
        "or" -> createBinaryExpression(Operation.OR, ctx)
        else -> UnresolvedBinaryExpression(ctx.children[1].text, ctx.expression(0).accept(this), ctx.expression(1).accept(this))
                .also { errors.add(it.toString()) }

    }

    private fun createBinaryExpression(operation: Operation, ctx: CimpleParser.BinExprContext) = BinaryExpression(operation, ctx.expression(0).accept(this), ctx.expression(1).accept(this))

}
