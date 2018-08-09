package io.dkozak.cimple.ast.walking

import io.dkozak.cimple.ast.*

fun walk(listener: AstListener, ast: AstNode): AstNode {
    AstWalker(listener).visit(ast)
    return ast
}

class AstWalker(
        private val listener: AstListener
) : AstVisitor<AstNode> {

    override fun visitProgram(program: Program): AstNode =
            program.apply {
                listener.enterProgram(program)
                visitNodes(program.statements)
                listener.exitProgram(program)
            }

    override fun visitVariableReference(variableReference: VariableReference): AstNode =
            variableReference.apply {
                listener.enterVariableReference(this)
            }

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral): AstNode =
            integerLiteral.apply {
                listener.enterIntegerLiteral(this)
            }

    override fun visitDoubleLiteral(doubleLiteral: DoubleLiteral): AstNode =
            doubleLiteral.apply {
                listener.enterDoubleLiteral(this)
            }

    override fun visitStringLiteral(stringLiteral: StringLiteral): AstNode =
            stringLiteral.apply {
                listener.enterStringLiteral(this)
            }

    override fun visitBinaryExpression(binaryExpression: BinaryExpression): AstNode =
            binaryExpression.apply {
                listener.enterBinaryExpression(this)
                left.accept(this@AstWalker)
                right.accept(this@AstWalker)
            }


    override fun visitUnaryExpression(unaryExpression: UnaryExpression): AstNode =
            unaryExpression.apply {
                listener.enterUnaryExpression(this)
                expression.accept(this@AstWalker)
            }


    override fun visitVariableAssignment(variableAssignment: VariableAssignment): AstNode =
            variableAssignment.apply {
                listener.enterVariableAssignment(this)
                variable.accept(this@AstWalker)
                expression.accept(this@AstWalker)
            }

    override fun visitVariableDefinition(variableDefinition: VariableDefinition): AstNode =
            variableDefinition.apply {
                listener.enterVariableDefinition(variableDefinition)
                variable.accept(this@AstWalker)
                expression.accept(this@AstWalker)
            }

    override fun visitPrintStatement(printStatement: PrintStatement): AstNode =
            printStatement.apply {
                listener.enterPrintStatement(this)
                expression.accept(this@AstWalker)
            }

    override fun visitInputStatement(inputStatement: InputStatement): AstNode =
            inputStatement.apply {
                listener.enterInputStatement(inputStatement)
            }

    override fun visitIfStatement(ifStatement: IfStatement): AstNode =
            ifStatement.apply {
                listener.enterIfStatement(this)
                expression.accept(this@AstWalker)
                visitNodes(thenStatements)
                visitNodes(elseStatements)
                listener.exitIfStatement(this)
            }

    override fun visitReturnStatement(returnStatement: ReturnStatement): AstNode =
            returnStatement.apply {
                listener.enterReturnStatement(this)
                expression.accept(this@AstWalker)
            }

    override fun visitForLoop(forLoop: ForLoop): AstNode =
            forLoop.apply {
                listener.enterForLoop(this)
                setup.accept(this@AstWalker)
                testExpression.accept(this@AstWalker)
                increment.accept(this@AstWalker)
                visitNodes(statements)
                listener.exitForLoop(this)
            }

    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): AstNode =
            functionDefinition.apply {
                listener.enterFunctionDefinition(this)
                visitNodes(formalParameters)
                visitNodes(body)
                listener.exitFunctionDefinition(this)
            }

    override fun visitParameterDefinition(parameterDefinition: ParameterDefinition): AstNode = parameterDefinition

    override fun visitFunctionCall(functionCall: FunctionCall): AstNode =
            functionCall.apply {
                listener.enterFunctionCall(functionCall)
                visitNodes(arguments)
            }


    override fun visitUnresolvedVariableReference(unresolvedVariableReference: UnresolvedVariableReference): AstNode {
        throw UnsupportedOperationException("Cannot walk over tree with unresolved references")
    }

    override fun visitUnresolvedFunctionCall(unresolvedFunctionCall: UnresolvedFunctionCall): AstNode {
        throw UnsupportedOperationException("Cannot walk over tree with unresolved references")
    }
}