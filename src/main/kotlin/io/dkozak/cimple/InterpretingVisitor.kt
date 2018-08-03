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
        Operation.PLUS -> evaluateExpression(expression.left) + evaluateExpression(expression.right)
        Operation.MINUS -> evaluateExpression(expression.left) - evaluateExpression(expression.right)
        Operation.MULT -> evaluateExpression(expression.left) * evaluateExpression(expression.right)
        Operation.DIV -> evaluateExpression(expression.left) / evaluateExpression(expression.right)
        Operation.MOD -> evaluateExpression(expression.left) % evaluateExpression(expression.right)

        Operation.EQUALS -> if (evaluateExpression(expression.left) == evaluateExpression(expression.right)) 1 else 0
        Operation.NOT_EQUALS -> if (evaluateExpression(expression.left) != evaluateExpression(expression.right)) 1 else 0
        Operation.LT -> if (evaluateExpression(expression.left) < evaluateExpression(expression.right)) 1 else 0
        Operation.LE -> if (evaluateExpression(expression.left) <= evaluateExpression(expression.right)) 1 else 0
        Operation.GT -> if (evaluateExpression(expression.left) > evaluateExpression(expression.right)) 1 else 0
        Operation.GE -> if (evaluateExpression(expression.left) >= evaluateExpression(expression.right)) 1 else 0

        Operation.AND -> if (evaluateExpression(expression.left) != 0 && evaluateExpression(expression.right) != 0) 1 else 0
        Operation.OR -> if (evaluateExpression(expression.left) != 0 || evaluateExpression(expression.right) != 0) 1 else 0
        Operation.NOT -> throw IllegalArgumentException("Not is only unary")
    }
}