package io.dkozak.cimple

class ExpressionAstCreatingVisitor(
        private val symbolTable: SymbolTable
) : CimpleBaseVisitor<Expression>() {


    override fun visitFunctionCall(ctx: CimpleParser.FunctionCallContext): Expression {
        val functionName = ctx.ID().text
        val symbol = symbolTable.get(functionName)
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

    override fun visitVarExpr(ctx: CimpleParser.VarExprContext): Expression {
        val variableSymbol = symbolTable.get(ctx.text)
        if (variableSymbol is VariableSymbol) {
            return if (ctx.MINUS() != null) UnaryExpression(Operation.MINUS, variableSymbol.variableReference) else variableSymbol.variableReference
        } else {
            TODO("Handle semantic error")
        }
    }

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
    }

    private fun createBinaryExpression(operation: Operation, ctx: CimpleParser.BinExprContext) = BinaryExpression(operation, ctx.expression(0).accept(this), ctx.expression(1).accept(this))

}
