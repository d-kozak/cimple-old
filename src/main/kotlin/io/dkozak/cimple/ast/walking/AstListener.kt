package io.dkozak.cimple.ast.walking

import io.dkozak.cimple.ast.*

interface AstListener {
    fun enterProgram(program: Program)
    fun enterVariableReference(variableReference: VariableReference)
    fun enterIntegerLiteral(integerLiteral: IntegerLiteral)
    fun enterDoubleLiteral(doubleLiteral: DoubleLiteral)
    fun enterStringLiteral(stringLiteral: StringLiteral)
    fun enterBinaryExpression(binaryExpression: BinaryExpression)
    fun enterUnaryExpression(unaryExpression: UnaryExpression)
    fun enterVariableDefinition(variableDefinition: VariableDefinition)
    fun enterVariableAssignment(variableAssignment: VariableAssignment)
    fun enterPrintStatement(printStatement: PrintStatement)
    fun enterInputStatement(inputStatement: InputStatement)
    fun enterIfStatement(ifStatement: IfStatement)
    fun enterReturnStatement(returnStatement: ReturnStatement)
    fun enterForLoop(forLoop: ForLoop)
    fun enterFunctionDefinition(functionDefinition: FunctionDefinition)
    fun enterFunctionCall(functionCall: FunctionCall)
    fun enterParameterDefinition(parameterDefinition: ParameterDefinition)


    fun exitProgram(program: Program)
    fun exitIfStatement(ifStatement: IfStatement)
    fun exitForLoop(forLoop: ForLoop)
    fun exitFunctionDefinition(functionDefinition: FunctionDefinition)

}