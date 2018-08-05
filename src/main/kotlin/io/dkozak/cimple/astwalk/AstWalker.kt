package io.dkozak.cimple.astwalk

import io.dkozak.cimple.*

fun walk(listener: AstListener, ast: AstNode): AstNode {
    AstWalker(listener).visit(ast)
    return ast
}

class AstWalker(
        private val listener: AstListener
) : AstVisitor<AstNode> {

    override fun visitProgram(program: Program): AstNode =
            program.apply {
                listener.visitProgram(this)
                visitNodes(this.statements)
            }

    override fun visitVariableReference(variableReference: VariableReference): AstNode =
            variableReference.apply {
                listener.visitVariableReference(this)
            }

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral): AstNode =
            integerLiteral.apply {
                listener.visitIntegerLiteral(this)
            }

    override fun visitDoubleLiteral(doubleLiteral: DoubleLiteral): AstNode =
            doubleLiteral.apply {
                listener.visitDoubleLiteral(this)
            }

    override fun visitStringLiteral(stringLiteral: StringLiteral): AstNode =
            stringLiteral.apply {
                listener.visitStringLiteral(this)
            }


    override fun visitBinaryExpression(binaryExpression: BinaryExpression): AstNode =
            binaryExpression.apply {
                listener.visitBinaryExpression(this)
                left.accept(this@AstWalker)
                right.accept(this@AstWalker)
            }


    override fun visitUnaryExpression(unaryExpression: UnaryExpression): AstNode =
            unaryExpression.apply {
                listener.visitUnaryExpression(this)
                expression.accept(this@AstWalker)
            }


    override fun visitVariableAssignment(variableAssignment: VariableAssignment): AstNode =
            variableAssignment.apply {
                listener.visitVariableAssignment(this)
                variable.accept(this@AstWalker)
                expression.accept(this@AstWalker)
            }

    override fun visitPrintStatement(printStatement: PrintStatement): AstNode =
            printStatement.apply {
                listener.visitPrintStatement(this)
                expression.accept(this@AstWalker)
            }

    override fun visitInputStatement(inputStatement: InputStatement): AstNode =
            inputStatement.apply {
                listener.visitInputStatement(inputStatement)
                variable.accept(this@AstWalker)
            }

    override fun visitIfStatement(ifStatement: IfStatement): AstNode =
            ifStatement.apply {
                listener.visitIfStatement(this)
                expression.accept(this@AstWalker)
                visitNodes(thenStatements)
                visitNodes(elseStatements)
            }

    override fun visitReturnStatement(returnStatement: ReturnStatement): AstNode =
            returnStatement.apply {
                listener.visitReturnStatement(this)
                expression.accept(this@AstWalker)
            }

    override fun visitForLoop(forLoop: ForLoop): AstNode =
            forLoop.apply {
                listener.visitForLoop(this)
                setup.accept(this@AstWalker)
                testExpression.accept(this@AstWalker)
                increment.accept(this@AstWalker)
                visitNodes(statements)
            }

    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): AstNode =
            functionDefinition.apply {
                listener.visitFunctionDefinition(this)
                visitNodes(formalParameters)
                visitNodes(body!!)
            }

    override fun visitFunctionCall(functionCall: FunctionCall): AstNode =
            functionCall.apply {
                listener.visitFunctionCall(functionCall)
                visitNodes(arguments)
            }
}