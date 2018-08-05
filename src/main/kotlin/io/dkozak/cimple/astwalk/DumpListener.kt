package io.dkozak.cimple.astwalk

import io.dkozak.cimple.*

class DumpListener : AstListener {
    override fun visitProgram(program: Program) {
        println(program)
    }

    override fun visitVariableReference(variableReference: VariableReference) {
        println(variableReference)
    }

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral) {
        println(integerLiteral)
    }

    override fun visitDoubleLiteral(doubleLiteral: DoubleLiteral) {
        println(doubleLiteral)
    }

    override fun visitStringLiteral(stringLiteral: StringLiteral) {
        println(stringLiteral)
    }

    override fun visitBinaryExpression(binaryExpression: BinaryExpression) {
        println(binaryExpression)
    }

    override fun visitUnaryExpression(unaryExpression: UnaryExpression) {
        println(unaryExpression)
    }

    override fun visitVariableAssignment(variableAssignment: VariableAssignment) {
        println(variableAssignment)
    }

    override fun visitPrintStatement(printStatement: PrintStatement) {
        println(printStatement)
    }

    override fun visitInputStatement(inputStatement: InputStatement) {
        println(inputStatement)
    }

    override fun visitIfStatement(ifStatement: IfStatement) {
        println(ifStatement)
    }

    override fun visitReturnStatement(returnStatement: ReturnStatement) {
        println(returnStatement)
    }

    override fun visitForLoop(forLoop: ForLoop) {
        println(forLoop)
    }

    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition) {
        println(functionDefinition)
    }

    override fun visitFunctionCall(functionCall: FunctionCall) {
        println(functionCall)
    }
}