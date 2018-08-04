package io.dkozak.cimple

interface AstNode

data class Program(val statements: List<AstNode>) : AstNode

abstract class Expression : AstNode

data class VariableReference(
        val name: String
) : Expression()

data class IntegerLiteral(
        val value: Int
) : Expression()

data class BinaryExpression(
        val operation: Operation,
        val left: Expression,
        val right: Expression
) : Expression()

data class UnaryExpression(
        val operation: Operation,
        val expression: Expression
) : Expression()

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

data class UnresolvedBinaryExpression(
        val operation: String,
        val left: Expression,
        val right: Expression
) : Expression()

data class VariableAssignment(
        val variable: VariableReference,
        val expression: Expression
) : AstNode

data class PrintStatement(
        val expression: Expression
) : AstNode

data class InputStatement(
        val variable: VariableReference
) : AstNode

data class IfStatement(
        val expression: Expression,
        val thenStatements: List<AstNode>,
        val elseStatements: List<AstNode>
) : AstNode

data class ReturnStatement(
        val expression: Expression
) : AstNode

data class ForLoop(
        val setup: VariableAssignment,
        val testExpression: Expression,
        val statements: List<AstNode>,
        val increment: VariableAssignment
) : AstNode


data class FunctionDefinition(
        val name: String,
        val formalParameters: List<VariableReference>,
        val body: List<AstNode>
) : AstNode, Symbol

data class FunctionCall(
        val function: FunctionDefinition,
        val arguments: List<Expression>
) : Expression()




