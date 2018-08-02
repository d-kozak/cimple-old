package io.dkozak.cimple

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("Expected one argument, file to interpret")
    }
    val input = File(args[0]).readText()
    val parseTree = parse(input)
    val ast = toAst(parseTree)
    interpret(ast)
}

class AstBuildingListener : CimpleBaseListener() {

    val statements: MutableList<AstNode> = mutableListOf()

    val symbolTable: MutableMap<String, VariableReference> = mutableMapOf()

    override fun enterVariableAssignment(ctx: CimpleParser.VariableAssignmentContext) {
        val name = ctx.ID().symbol.text
        val variableReference = symbolTable.computeIfAbsent(name) { VariableReference(name) }
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        statements.add(VariableAssignment(variableReference, expression))
    }

    override fun enterPrintStatement(ctx: CimpleParser.PrintStatementContext) {
        val expression = ExpressionAstCreatingVisitor(symbolTable).visit(ctx.expression())
        statements.add(PrintStatement(expression))
    }

}

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

}

fun interpret(ast: List<AstNode>) {
    val symbolTable: MutableMap<VariableReference, Int> = mutableMapOf()
    for (node in ast) {
        if (node is VariableAssignment) {
            symbolTable[node.variable] = evaluateExpression(node.expression, symbolTable)
        } else if (node is PrintStatement) {
            println(evaluateExpression(node.expression, symbolTable))
        }
    }
}


fun evaluateExpression(expression: Expression, symbolTable: Map<VariableReference, Int>) = when (expression) {
    is VariableReference -> symbolTable[expression]!!
    is IntegerLiteral -> expression.value
    is BinaryExpression -> evaluateBinaryExpression(expression, symbolTable)
    else -> throw IllegalArgumentException("Unknown type of expression ${expression.javaClass}")
}

fun evaluateBinaryExpression(expression: BinaryExpression, symbolTable: Map<VariableReference, Int>): Int = when (expression.operation) {
    "+" -> evaluateExpression(expression.left, symbolTable) + evaluateExpression(expression.right, symbolTable)
    "-" -> evaluateExpression(expression.left, symbolTable) - evaluateExpression(expression.right, symbolTable)
    "*" -> evaluateExpression(expression.left, symbolTable) * evaluateExpression(expression.right, symbolTable)
    "/" -> evaluateExpression(expression.left, symbolTable) / evaluateExpression(expression.right, symbolTable)
    else -> throw UnsupportedOperationException("Unknown type of operation: ${expression.operation}")
}


fun toAst(parseTree: ParseTree): List<AstNode> {
    val walker = ParseTreeWalker()
    val listener = AstBuildingListener()
    walker.walk(listener, parseTree)
    return listener.statements
}

fun parse(input: String): CimpleParser.ProgramContext {
    val lexer = CimpleLexer(ANTLRInputStream(input))
    val stream = CommonTokenStream(lexer)
    val parser = CimpleParser(stream)
    return parser.program()
}

