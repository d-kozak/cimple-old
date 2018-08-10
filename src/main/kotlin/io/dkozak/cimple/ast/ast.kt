package io.dkozak.cimple.ast

import io.dkozak.cimple.Symbol
import io.dkozak.cimple.typesystem.Type

interface AstNode : AstVisitee

data class Program(val statements: List<AstNode>) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitProgram(this)
}

abstract class Expression(var type: Type = Type.UNKNOWN) : AstNode

data class ParameterDefinition(
        val name: String,
        val type: Type
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitParameterDefinition(this)
}

data class VariableReference(
        val name: String
) : Expression() {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitVariableReference(this)
}

data class UnresolvedVariableReference(
        val name: String
) : Expression() {

    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitUnresolvedVariableReference(this)
}

data class IntegerLiteral(
        val value: Int
) : Expression(Type.INT) {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitIntegerLiteral(this)
}

data class DoubleLiteral(
        val value: Double
) : Expression(Type.DOUBLE) {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitDoubleLiteral(this)
}

data class StringLiteral(
        val value: String
) : Expression(Type.STRING) {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitStringLiteral(this)
}

data class BinaryExpression(
        val operation: Operation,
        val left: Expression,
        val right: Expression
) : Expression() {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitBinaryExpression(this)
}

data class UnresolvedBinaryExpression(
        val operation: String,
        val left: Expression,
        val right: Expression
) : Expression() {
    override fun <T> accept(visitor: AstVisitor<T>): T = throw IllegalStateException("Never meant for visiting")

}

data class UnaryExpression(
        val operation: Operation,
        val expression: Expression
) : Expression() {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitUnaryExpression(this)
}

enum class Operation {
    AND,
    OR,
    NOT,
    EQUALS,
    NOT_EQUALS,
    LT,
    LE,
    GT,
    GE,
    MULT,
    DIV,
    PLUS,
    MINUS,
    MOD
}

data class VariableDefinition(
        val variable: VariableReference,
        val expression: Expression,
        val type: Type
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitVariableDefinition(this)
}

data class VariableAssignment(
        val variable: VariableReference,
        val expression: Expression
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitVariableAssignment(this)
}


data class PrintStatement(
        val expression: Expression
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitPrintStatement(this)
}

data class InputStatement(
        val name: String,
        val type: Type
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitInputStatement(this)
}

data class IfStatement(
        val condition: Expression,
        val thenStatements: List<AstNode>,
        val elseStatements: List<AstNode>
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitIfStatement(this)
}

data class ReturnStatement(
        val expression: Expression
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitReturnStatement(this)
}

data class ForLoop(
        val setup: VariableDefinition,
        val testExpression: Expression,
        val statements: List<AstNode>,
        val increment: VariableAssignment
) : AstNode {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitForLoop(this)
}


data class FunctionDefinition(
        val name: String,
        var formalParameters: List<ParameterDefinition>,
        var body: List<AstNode>,
        val returnType: Type?
) : AstNode, Symbol {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitFunctionDefinition(this)
}

data class FunctionCall(
        val function: FunctionDefinition,
        val arguments: List<Expression>
) : Expression() {
    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitFunctionCall(this)


    override fun toString(): String = "FunctionCall(function=${function.name},argsCount=${arguments.size})"

}

data class UnresolvedFunctionCall(
        val functionName: String,
        val arguments: List<Expression>
) : Expression() {

    override fun <T> accept(visitor: AstVisitor<T>): T = visitor.visitUnresolvedFunctionCall(this)
}




