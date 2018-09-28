package io.dkozak.cimple.interpret

import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.VariableSymbol
import io.dkozak.cimple.ast.*
import io.dkozak.cimple.typesystem.IntegerValue
import io.dkozak.cimple.typesystem.Value

class InterpretingAstVisitor(
        private val symbolTable: SymbolTable
) : AstVisitor<Value?> {

    fun interpretStatements(nodes: List<AstNode>): Value? {
        for (statement in nodes) {
            val retVal = statement.accept(this)
            if (retVal != null)
                return retVal
        }
        return null
    }

    override fun visitProgram(program: Program): Value? = interpretStatements(program.statements)

    override fun visitVariableReference(variableReference: VariableReference): Value? = (symbolTable.get(variableReference.name) as VariableSymbol).value

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral): Value? = IntegerValue(integerLiteral.value)

    override fun visitDoubleLiteral(doubleLiteral: DoubleLiteral): Value? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitStringLiteral(stringLiteral: StringLiteral): Value? {
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

    override fun visitVariableDefinition(variableDefinition: VariableDefinition): Value? {
        val newValue = variableDefinition.expression.accept(this)!!
        val variableSymbol = VariableSymbol(variableDefinition.variable.name, variableDefinition.type, newValue)
        symbolTable[variableDefinition.variable.name] = variableSymbol
        return null
    }

    override fun visitVariableAssignment(variableAssignment: VariableAssignment): Value? {
        val newValue = variableAssignment.expression.accept(this)!!
        val variableSymbol = symbolTable[variableAssignment.variable.name] as VariableSymbol
        variableSymbol.value = newValue
        return null
    }

    override fun visitPrintStatement(printStatement: PrintStatement): Value? {
        println(printStatement.expression.accept(this)!!)
        return null
    }

    override fun visitInputStatement(inputStatement: InputStatement): Value? {
        print("${inputStatement.name}:")
        val input = readLine()
        if (input == null || input.isEmpty()) {
            throw IllegalArgumentException("No input value read")
        }
        try {
            val variableSymbol = symbolTable.computeIfAbsent(inputStatement.name) { VariableSymbol(inputStatement.name, inputStatement.type) } as VariableSymbol
            variableSymbol.value = IntegerValue(input.toInt())
        } catch (ex: NumberFormatException) {
            throw IllegalArgumentException("Input ${input} is not an integer")
        }
        return null
    }

    override fun visitIfStatement(ifStatement: IfStatement): Value? {
        val condition = ifStatement.condition.accept(this)!!
        val retVal: Value?
        symbolTable.push()
        if (condition.isTrue()) {
            retVal = interpretStatements(ifStatement.thenStatements)
        } else {
            retVal = interpretStatements(ifStatement.elseStatements)
        }
        symbolTable.pop()
        return retVal
    }

    override fun visitReturnStatement(returnStatement: ReturnStatement): Value? = returnStatement.expression.accept(this)!!

    override fun visitForLoop(forLoop: ForLoop): Value? {
        symbolTable.push()

        val newValue = forLoop.setup.expression.accept(this)!!
        val variableSymbol = VariableSymbol(forLoop.setup.variable.name, forLoop.setup.type, newValue)

        symbolTable[forLoop.setup.variable.name] = variableSymbol

        var retVal: Value? = null

        while (forLoop.testExpression.accept(this)!!.isTrue()) {
            retVal = interpretStatements(forLoop.statements)
            if (retVal != null)
                break
            val incrementSymbol = symbolTable.computeIfAbsent(forLoop.increment.variable.name) { VariableSymbol(forLoop.increment.variable.name, forLoop.increment.variable.type) } as VariableSymbol
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
            symbolTable[parameter.name] = VariableSymbol(parameter.name, parameter.type, argument)
        }
        val retVal = interpretStatements(functionCall.function.body)

        symbolTable.pop()

        return retVal
    }

    override fun visitUnresolvedVariableReference(unresolvedVariableReference: UnresolvedVariableReference): Value? {
        throw UnsupportedOperationException("Should never be called")
    }

    override fun visitParameterDefinition(parameterDefinition: ParameterDefinition): Value? {
        throw UnsupportedOperationException("Should never be called")
    }

    override fun visitUnresolvedFunctionCall(unresolvedFunctionCall: UnresolvedFunctionCall): Value? {
        throw UnsupportedOperationException("Should never be called")
    }
}