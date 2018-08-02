package io.dkozak.cimple

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("Expected one argument, file to interpret")
    }
    val input = File(args[0]).readText()
    val parseTree = parse(input)
    val ast = toAst(parseTree)
    interpret(ast as Program)
}

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


class InterpretingTreeVisitor {

    val symbolTable: MutableMap<VariableReference, Int> = mutableMapOf()

    fun start(program: Program) {
        for (node in program.statements) {
            if (node is VariableAssignment) {
                symbolTable[node.variable] = evaluateExpression(node.expression)
            } else if (node is PrintStatement) {
                println(evaluateExpression(node.expression))
            }
        }
    }

    fun evaluateExpression(expression: Expression) = when (expression) {
        is VariableReference -> symbolTable[expression]!!
        is IntegerLiteral -> expression.value
        is BinaryExpression -> evaluateBinaryExpression(expression)
        else -> throw IllegalArgumentException("Unknown type of expression ${expression.javaClass}")
    }

    fun evaluateBinaryExpression(expression: BinaryExpression): Int = when (expression.operation) {
        "+" -> evaluateExpression(expression.left) + evaluateExpression(expression.right)
        "-" -> evaluateExpression(expression.left) - evaluateExpression(expression.right)
        "*" -> evaluateExpression(expression.left) * evaluateExpression(expression.right)
        "/" -> evaluateExpression(expression.left) / evaluateExpression(expression.right)

        "==" -> if (evaluateExpression(expression.left) == evaluateExpression(expression.right)) 1 else 0
        "!=" -> if (evaluateExpression(expression.left) != evaluateExpression(expression.right)) 1 else 0
        "<" -> if (evaluateExpression(expression.left) < evaluateExpression(expression.right)) 1 else 0
        "<=" -> if (evaluateExpression(expression.left) <= evaluateExpression(expression.right)) 1 else 0
        ">" -> if (evaluateExpression(expression.left) > evaluateExpression(expression.right)) 1 else 0
        ">=" -> if (evaluateExpression(expression.left) >= evaluateExpression(expression.right)) 1 else 0

        else -> throw UnsupportedOperationException("Unknown type of operation: ${expression.operation}")
    }
}


fun interpret(program: Program) {
    InterpretingTreeVisitor().start(program)
}

fun toAst(parseTree: ParseTree) = AstCreatingVisitor().visit(parseTree)


fun parse(input: String): CimpleParser.ProgramContext {
    val lexer = CimpleLexer(ANTLRInputStream(input))
    val stream = CommonTokenStream(lexer)
    val parser = CimpleParser(stream)
    return parser.program()
}



