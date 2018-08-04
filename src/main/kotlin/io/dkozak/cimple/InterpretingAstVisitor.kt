package io.dkozak.cimple

class InterpretingAstVisitor(
        private val symbolTable: SymbolTable
) : AstVisitor<Int?> {

    fun visitStatements(statements: List<AstNode>): Int? {
        for (statement in statements) {
            val retVal = statement.accept(this)
            if (retVal != null)
                return retVal
        }
        return null
    }

    override fun visitProgram(program: Program): Int? = visitStatements(program.statements)

    override fun visitVariableReference(variableReference: VariableReference): Int? = (symbolTable.get(variableReference.name) as VariableSymbol).value

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral): Int? = integerLiteral.value

    override fun visitBinaryExpression(binaryExpression: BinaryExpression): Int? = when (binaryExpression.operation) {
        Operation.PLUS -> binaryExpression.left.accept(this)!! + binaryExpression.right.accept(this)!!
        Operation.MINUS -> binaryExpression.left.accept(this)!! - binaryExpression.right.accept(this)!!
        Operation.MULT -> binaryExpression.left.accept(this)!! * binaryExpression.right.accept(this)!!
        Operation.DIV -> binaryExpression.left.accept(this)!! / binaryExpression.right.accept(this)!!
        Operation.MOD -> binaryExpression.left.accept(this)!! % binaryExpression.right.accept(this)!!

        Operation.EQUALS -> if (binaryExpression.left.accept(this)!! == binaryExpression.right.accept(this)!!) 1 else 0
        Operation.NOT_EQUALS -> if (binaryExpression.left.accept(this)!! != binaryExpression.right.accept(this)!!) 1 else 0
        Operation.LT -> if (binaryExpression.left.accept(this)!! < binaryExpression.right.accept(this)!!) 1 else 0
        Operation.LE -> if (binaryExpression.left.accept(this)!! <= binaryExpression.right.accept(this)!!) 1 else 0
        Operation.GT -> if (binaryExpression.left.accept(this)!! > binaryExpression.right.accept(this)!!) 1 else 0
        Operation.GE -> if (binaryExpression.left.accept(this)!! >= binaryExpression.right.accept(this)!!) 1 else 0

        Operation.AND -> if (binaryExpression.left.accept(this)!! != 0 && binaryExpression.right.accept(this)!! != 0) 1 else 0
        Operation.OR -> if (binaryExpression.left.accept(this)!! != 0 || binaryExpression.right.accept(this)!! != 0) 1 else 0

        else -> throw IllegalStateException("Other operations such as ${binaryExpression.operation} are not supported")
    }

    override fun visitUnaryExpression(unaryExpression: UnaryExpression): Int? = when (unaryExpression.operation) {
        Operation.MINUS -> -unaryExpression.expression.accept(this)!!
        Operation.NOT -> if (unaryExpression.expression.accept(this)!! != 0) 0 else 1
        else -> throw IllegalArgumentException("Unknown type of operation ${unaryExpression.operation}")
    }

    override fun visitVariableAssignment(variableAssignment: VariableAssignment): Int? {
        val newValue = variableAssignment.expression.accept(this)!!
        val variableSymbol = symbolTable.computeIfAbsent(variableAssignment.variable.name) { VariableSymbol(variableAssignment.variable) } as VariableSymbol
        variableSymbol.value = newValue
        return null
    }

    override fun visitPrintStatement(printStatement: PrintStatement): Int? {
        println(printStatement.expression.accept(this)!!)
        return null
    }

    override fun visitInputStatement(inputStatement: InputStatement): Int? {
        print("${inputStatement.variable.name}:")
        val input = readLine()
        if (input == null || input.isEmpty()) {
            throw IllegalArgumentException("No input value read")
        }
        try {
            val variableSymbol = symbolTable.computeIfAbsent(inputStatement.variable.name) { VariableSymbol(inputStatement.variable) } as VariableSymbol
            variableSymbol.value = input.toInt()
        } catch (ex: NumberFormatException) {
            throw IllegalArgumentException("Input ${input} is not an integer")
        }
        return null
    }

    override fun visitIfStatement(ifStatement: IfStatement): Int? {
        val condition = ifStatement.expression.accept(this)!!
        val retVal: Int?
        symbolTable.push()
        if (condition != 0) {
            retVal = visitStatements(ifStatement.thenStatements)
        } else {
            retVal = visitStatements(ifStatement.elseStatements)
        }
        symbolTable.pop()
        return retVal
    }

    override fun visitReturnStatement(returnStatement: ReturnStatement): Int? = returnStatement.expression.accept(this)!!

    override fun visitForLoop(forLoop: ForLoop): Int? {
        symbolTable.push()
        val variableSymbol = symbolTable.computeIfAbsent(forLoop.setup.variable.name) { VariableSymbol(forLoop.setup.variable) } as VariableSymbol
        variableSymbol.value = forLoop.setup.expression.accept(this)!!

        var retVal: Int? = null

        while (forLoop.testExpression.accept(this) != 0) {
            retVal = visitStatements(forLoop.statements)
            if (retVal != null)
                break
            val incrementSymbol = symbolTable.computeIfAbsent(forLoop.increment.variable.name) { VariableSymbol(forLoop.increment.variable) } as VariableSymbol
            incrementSymbol.value = forLoop.increment.expression.accept(this)!!
        }
        symbolTable.pop()
        return retVal
    }

    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): Int? {
        // nothing to do
        return null
    }

    override fun visitFunctionCall(functionCall: FunctionCall): Int? {
        symbolTable.push()

        val arguments = functionCall.arguments.map { it.accept(this)!! }
        for (i in 0 until arguments.size) {
            val parameter = functionCall.function.formalParameters[i]
            val argument = arguments[i]
            symbolTable.put(parameter.name, VariableSymbol(parameter, argument))
        }
        val retVal = visitStatements(functionCall.function.body!!)

        symbolTable.pop()

        return retVal
    }
}