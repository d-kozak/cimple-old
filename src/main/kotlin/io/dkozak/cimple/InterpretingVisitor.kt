package io.dkozak.cimple

class InterpretingVisitor {

    val symbolTable: MutableMap<VariableReference, Int> = mutableMapOf()

    fun start(program: Program) {
        executeBlock(program.statements)
    }

    fun executeBlock(block: List<AstNode>) {
        for (node in block) {
            if (node is VariableAssignment) {
                symbolTable[node.variable] = evaluateExpression(node.expression)
            } else if (node is PrintStatement) {
                println(evaluateExpression(node.expression))
            } else if (node is IfStatement) {
                val condition = evaluateExpression(node.expression)
                if (condition != 0) {
                    executeBlock(node.thenStatements)
                } else {
                    executeBlock(node.elseStatements)
                }
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