package io.dkozak.cimple

class InterpretingAstVisitor(
        private val symbolTable: SymbolTable
) : AstVisitor<Value?> {

    fun visitStatements(statements: List<AstNode>): Value? {
        for (statement in statements) {
            val retVal = statement.accept(this)
            if (retVal != null)
                return retVal
        }
        return null
    }

    override fun visitProgram(program: Program): Value? = visitStatements(program.statements)

    override fun visitVariableReference(variableReference: VariableReference): Value? = (symbolTable.get(variableReference.name) as VariableSymbol).value

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral): Value? = IntegerValue(integerLiteral.value)

    override fun visitDoubleLiteral(DoubleLiteral: DoubleLiteral): Value? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitStringLiteral(StringLiteral: StringLiteral): Value? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitBinaryExpression(binaryExpression: BinaryExpression): Value? = when (binaryExpression.operation) {
        Operation.PLUS -> binaryExpression.left.accept(this)!! + binaryExpression.right.accept(this)!!
        Operation.MINUS -> binaryExpression.left.accept(this)!! - binaryExpression.right.accept(this)!!
        Operation.MULT -> binaryExpression.left.accept(this)!! * binaryExpression.right.accept(this)!!
        Operation.DIV -> binaryExpression.left.accept(this)!! / binaryExpression.right.accept(this)!!
        Operation.MOD -> binaryExpression.left.accept(this)!! % binaryExpression.right.accept(this)!!

        Operation.EQUALS -> if (binaryExpression.left.accept(this)!! == binaryExpression.right.accept(this)!!) IntegerValue(1) else IntegerValue(0)
        Operation.NOT_EQUALS -> if (binaryExpression.left.accept(this)!! != binaryExpression.right.accept(this)!!) IntegerValue(1) else IntegerValue(0)
        Operation.LT -> if (binaryExpression.left.accept(this)!! < binaryExpression.right.accept(this)!!) IntegerValue(1) else IntegerValue(0)
        Operation.LE -> if (binaryExpression.left.accept(this)!! <= binaryExpression.right.accept(this)!!) IntegerValue(1) else IntegerValue(0)
        Operation.GT -> if (binaryExpression.left.accept(this)!! > binaryExpression.right.accept(this)!!) IntegerValue(1) else IntegerValue(0)
        Operation.GE -> if (binaryExpression.left.accept(this)!! >= binaryExpression.right.accept(this)!!) IntegerValue(1) else IntegerValue(0)

        Operation.AND -> if (binaryExpression.left.accept(this)!!.isTrue() && binaryExpression.right.accept(this)!!.isTrue()) IntegerValue(1) else IntegerValue(0)
        Operation.OR -> if (binaryExpression.left.accept(this)!!.isTrue() || binaryExpression.right.accept(this)!!.isTrue()) IntegerValue(1) else IntegerValue(0)

        else -> throw IllegalStateException("Other operations such as ${binaryExpression.operation} are not supported")
    }

    override fun visitUnaryExpression(unaryExpression: UnaryExpression): Value? = when (unaryExpression.operation) {
        Operation.MINUS -> -unaryExpression.expression.accept(this)!!
        Operation.NOT -> if (unaryExpression.expression.accept(this)!!.isTrue()) IntegerValue(0) else IntegerValue(1)
        else -> throw IllegalArgumentException("Unknown type of operation ${unaryExpression.operation}")
    }

    override fun visitVariableAssignment(variableAssignment: VariableAssignment): Value? {
        val newValue = variableAssignment.expression.accept(this)!!
        val variableSymbol = symbolTable.computeIfAbsent(variableAssignment.variable.name) { VariableSymbol(variableAssignment.variable) } as VariableSymbol
        variableSymbol.value = newValue
        return null
    }

    override fun visitPrintStatement(printStatement: PrintStatement): Value? {
        println(printStatement.expression.accept(this)!!)
        return null
    }

    override fun visitInputStatement(inputStatement: InputStatement): Value? {
        print("${inputStatement.variable.name}:")
        val input = readLine()
        if (input == null || input.isEmpty()) {
            throw IllegalArgumentException("No input value read")
        }
        try {
            val variableSymbol = symbolTable.computeIfAbsent(inputStatement.variable.name) { VariableSymbol(inputStatement.variable) } as VariableSymbol
            variableSymbol.value = IntegerValue(input.toInt())
        } catch (ex: NumberFormatException) {
            throw IllegalArgumentException("Input ${input} is not an integer")
        }
        return null
    }

    override fun visitIfStatement(ifStatement: IfStatement): Value? {
        val condition = ifStatement.expression.accept(this)!!
        val retVal: Value?
        symbolTable.push()
        if (condition.isTrue()) {
            retVal = visitStatements(ifStatement.thenStatements)
        } else {
            retVal = visitStatements(ifStatement.elseStatements)
        }
        symbolTable.pop()
        return retVal
    }

    override fun visitReturnStatement(returnStatement: ReturnStatement): Value? = returnStatement.expression.accept(this)!!

    override fun visitForLoop(forLoop: ForLoop): Value? {
        symbolTable.push()
        val variableSymbol = symbolTable.computeIfAbsent(forLoop.setup.variable.name) { VariableSymbol(forLoop.setup.variable) } as VariableSymbol
        variableSymbol.value = forLoop.setup.expression.accept(this)!!

        var retVal: Value? = null

        while (forLoop.testExpression.accept(this)!!.isTrue()) {
            retVal = visitStatements(forLoop.statements)
            if (retVal != null)
                break
            val incrementSymbol = symbolTable.computeIfAbsent(forLoop.increment.variable.name) { VariableSymbol(forLoop.increment.variable) } as VariableSymbol
            incrementSymbol.value = forLoop.increment.expression.accept(this)!!
        }
        symbolTable.pop()
        return retVal
    }

    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): Value? {
        // nothing to do
        return null
    }

    override fun visitFunctionCall(functionCall: FunctionCall): Value? {
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