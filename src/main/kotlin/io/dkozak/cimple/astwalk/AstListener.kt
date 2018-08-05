package io.dkozak.cimple.astwalk

import io.dkozak.cimple.*

interface AstListener {
    fun visitProgram(program: Program)
    fun visitVariableReference(variableReference: VariableReference)
    fun visitIntegerLiteral(integerLiteral: IntegerLiteral)
    fun visitDoubleLiteral(doubleLiteral: DoubleLiteral)
    fun visitStringLiteral(stringLiteral: StringLiteral)
    fun visitBinaryExpression(binaryExpression: BinaryExpression)
    fun visitUnaryExpression(unaryExpression: UnaryExpression)
    fun visitVariableAssignment(variableAssignment: VariableAssignment)
    fun visitPrintStatement(printStatement: PrintStatement)
    fun visitInputStatement(inputStatement: InputStatement)
    fun visitIfStatement(ifStatement: IfStatement)
    fun visitReturnStatement(returnStatement: ReturnStatement)
    fun visitForLoop(forLoop: ForLoop)
    fun visitFunctionDefinition(functionDefinition: FunctionDefinition)
    fun visitFunctionCall(functionCall: FunctionCall)
}