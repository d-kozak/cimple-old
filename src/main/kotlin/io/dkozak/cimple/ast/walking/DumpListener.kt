package io.dkozak.cimple.ast.walking

import io.dkozak.cimple.ast.*

class DumpListener : BaseAstListener() {

    override fun enterProgram(program: Program) {
        println(program)
    }

    override fun enterVariableReference(variableReference: VariableReference) {
        println(variableReference)
    }

    override fun enterIntegerLiteral(integerLiteral: IntegerLiteral) {
        println(integerLiteral)
    }

    override fun enterDoubleLiteral(doubleLiteral: DoubleLiteral) {
        println(doubleLiteral)
    }

    override fun enterStringLiteral(stringLiteral: StringLiteral) {
        println(stringLiteral)
    }

    override fun enterBinaryExpression(binaryExpression: BinaryExpression) {
        println(binaryExpression)
    }

    override fun enterUnaryExpression(unaryExpression: UnaryExpression) {
        println(unaryExpression)
    }

    override fun enterVariableAssignment(variableAssignment: VariableAssignment) {
        println(variableAssignment)
    }

    override fun enterVariableDefinition(variableDefinition: VariableDefinition) {
        println(variableDefinition)
    }

    override fun enterPrintStatement(printStatement: PrintStatement) {
        println(printStatement)
    }

    override fun enterInputStatement(inputStatement: InputStatement) {
        println(inputStatement)
    }

    override fun enterIfStatement(ifStatement: IfStatement) {
        println(ifStatement)
    }

    override fun enterReturnStatement(returnStatement: ReturnStatement) {
        println(returnStatement)
    }

    override fun enterForLoop(forLoop: ForLoop) {
        println(forLoop)
    }

    override fun enterFunctionDefinition(functionDefinition: FunctionDefinition) {
        println(functionDefinition)
    }

    override fun enterParameterDefinition(parameterDefinition: ParameterDefinition) {
        println(parameterDefinition)
    }

    override fun enterFunctionCall(functionCall: FunctionCall) {
        println(functionCall)
    }
}