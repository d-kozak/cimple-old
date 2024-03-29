package io.dkozak.cimple

/**
* Just an example of interpreter build as external tree walker, no longer maintained and integrated with rest of the platform
*/

@Deprecated(message = "This external visitor was replaced by an internal visitor")
class InterpretingExternalVisitor(
        private val symbolTable: SymbolTable
) {

    fun start(program: Program) {
        executeStatements(program.statements)
    }

    fun executeStatements(block: List<AstNode>): Int? {
        for (node in block) {
            when (node) {
                is VariableAssignment -> {
                    val newValue = evaluateExpression(node.expression)
                    val variableSymbol = symbolTable.computeIfAbsent(node.variable.name) { VariableSymbol(node.variable) } as VariableSymbol
                    variableSymbol.value = newValue
                }
                is PrintStatement -> println(evaluateExpression(node.expression))
                is IfStatement -> {
                    val condition = evaluateExpression(node.expression)
                    var retVal: Int?
                    symbolTable.push()
                    if (condition != 0) {
                        retVal = executeStatements(node.thenStatements)
                    } else {
                        retVal = executeStatements(node.elseStatements)
                    }
                    symbolTable.pop()

                    if (retVal != null)
                        return retVal
                }
                is InputStatement -> {
                    print("${node.variable.name}:")
                    val input = readLine()
                    if (input == null || input.isEmpty()) {
                        throw IllegalArgumentException("No input value read")
                    }
                    try {
                        val variableSymbol = symbolTable.computeIfAbsent(node.variable.name) { VariableSymbol(node.variable) } as VariableSymbol
                        variableSymbol.value = input.toInt()
                    } catch (ex: NumberFormatException) {
                        throw IllegalArgumentException("Input ${input} is not an integer")
                    }
                }
                is ForLoop -> {
                    symbolTable.push()
                    val variableSymbol = symbolTable.computeIfAbsent(node.setup.variable.name) { VariableSymbol(node.setup.variable) } as VariableSymbol
                    variableSymbol.value = evaluateExpression(node.setup.expression)

                    var retVal: Int? = null

                    while (evaluateExpression(node.testExpression) != 0) {
                        retVal = executeStatements(node.statements)
                        if (retVal != null)
                            break
                        val incrementSymbol = symbolTable.computeIfAbsent(node.increment.variable.name) { VariableSymbol(node.increment.variable) } as VariableSymbol
                        incrementSymbol.value = evaluateExpression(node.increment.expression)
                    }
                    symbolTable.pop()
                    if (retVal != null)
                        return retVal
                }
                is FunctionDefinition -> {
                    // nothing to do for it, just let it pass
                }
                is FunctionCall -> {
                    evaluateFunctionCall(node)
                }
                is ReturnStatement -> {
                    return evaluateExpression(node.expression)
                }
                else -> throw IllegalArgumentException("Unknown type of statement ${node.javaClass}")
            }
        }
        return null
    }

    private fun evaluateFunctionCall(node: FunctionCall): Int? {
        symbolTable.push()

        val arguments = node.arguments.map { evaluateExpression(it) }
        for (i in 0 until arguments.size) {
            val parameter = node.function.formalParameters[i]
            val argument = arguments[i]
            symbolTable.put(parameter.name, VariableSymbol(parameter, argument))
        }
        val retVal = executeStatements(node.function.body!!)

        symbolTable.pop()

        return retVal
    }

    fun evaluateExpression(expression: Expression) = when (expression) {
        is VariableReference -> (symbolTable.get(expression.name) as VariableSymbol).value
        is IntegerLiteral -> expression.value
        is BinaryExpression -> evaluateBinaryExpression(expression)
        is UnaryExpression -> evaluateUnaryExpression(expression)
        is FunctionCall -> evaluateFunctionCall(expression)!!
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