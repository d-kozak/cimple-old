package io.dkozak.cimple

class InterpretingVisitor {

    val symbolTable: MutableMap<VariableReference, Int> = mutableMapOf()

    fun start(program: Program) {
        executeStatements(program.statements)
    }

    fun executeStatements(block: List<AstNode>) {
        for (node in block) {
            when (node) {
                is VariableAssignment -> symbolTable[node.variable] = evaluateExpression(node.expression)
                is PrintStatement -> println(evaluateExpression(node.expression))
                is IfStatement -> {
                    val condition = evaluateExpression(node.expression)
                    if (condition != 0) {
                        executeStatements(node.thenStatements)
                    } else {
                        executeStatements(node.elseStatements)
                    }
                }
                is InputStatement -> {
                    print("${node.variable.name}:")
                    val input = readLine()
                    if (input == null || input.isEmpty()) {
                        throw IllegalArgumentException("No input value read")
                    }
                    try {
                        symbolTable[node.variable] = input.toInt()
                    } catch (ex: NumberFormatException) {
                        throw IllegalArgumentException("Input ${input} is not an integer")
                    }
                }
                is ForLoop -> {
                    symbolTable[node.setup.variable] = evaluateExpression(node.setup.expression)
                    while (evaluateExpression(node.testExpression) != 0) {
                        executeStatements(node.statements)
                        symbolTable[node.increment.variable] = evaluateExpression(node.increment.expression)
                    }
                }
                else -> throw IllegalArgumentException("Unknown type of statement ${node.javaClass}")
            }
        }
    }

    fun evaluateExpression(expression: Expression) = when (expression) {
        is VariableReference -> symbolTable[expression]!!
        is IntegerLiteral -> expression.value
        is BinaryExpression -> evaluateBinaryExpression(expression)
        is UnaryExpression -> evaluateUnaryExpression(expression)
        else -> throw IllegalArgumentException("Unknown type of expression ${expression.javaClass}")
    }

    fun evaluateUnaryExpression(expression: UnaryExpression): Int = when (expression.operation) {
        Operation.MINUS -> -evaluateExpression(expression.expression)
        Operation.NOT -> if (evaluateExpression(expression.expression) != 0) 0 else 1
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