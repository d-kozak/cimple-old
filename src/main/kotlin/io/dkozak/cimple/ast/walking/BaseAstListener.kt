package io.dkozak.cimple.ast.walking

import io.dkozak.cimple.ast.*

open class BaseAstListener : AstListener {

    override fun enterParameterDefinition(parameterDefinition: ParameterDefinition) {

    }

    override fun enterProgram(program: Program) {
        
    }

    override fun enterVariableReference(variableReference: VariableReference) {
        
    }

    override fun enterIntegerLiteral(integerLiteral: IntegerLiteral) {
        
    }

    override fun enterDoubleLiteral(doubleLiteral: DoubleLiteral) {
        
    }

    override fun enterStringLiteral(stringLiteral: StringLiteral) {
        
    }

    override fun enterBinaryExpression(binaryExpression: BinaryExpression) {
        
    }

    override fun enterUnaryExpression(unaryExpression: UnaryExpression) {
        
    }

    override fun enterVariableAssignment(variableAssignment: VariableAssignment) {
        
    }

    override fun enterVariableDefinition(variableDefinition: VariableDefinition) {

    }

    override fun enterPrintStatement(printStatement: PrintStatement) {
        
    }

    override fun enterInputStatement(inputStatement: InputStatement) {
        
    }

    override fun enterIfStatement(ifStatement: IfStatement) {
        
    }

    override fun enterReturnStatement(returnStatement: ReturnStatement) {
        
    }

    override fun enterForLoop(forLoop: ForLoop) {
        
    }

    override fun enterFunctionDefinition(functionDefinition: FunctionDefinition) {

    }

    override fun enterFunctionCall(functionCall: FunctionCall) {

    }

    override fun exitProgram(program: Program) {

    }


    override fun exitIfStatement(ifStatement: IfStatement) {

    }

    override fun exitForLoop(forLoop: ForLoop) {

    }

    override fun exitFunctionDefinition(functionDefinition: FunctionDefinition) {
        
    }
}