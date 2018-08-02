package io.dkozak.cimple

interface AstNode

data class Program(val statements: List<AstNode>) : AstNode

abstract class Expression : AstNode

data class VariableReference(
        val name: String
) : Expression()

data class UnresolvedVariableReference(
        val name: String
) : Expression()

data class IntegerLiteral(
        val value: Int
) : Expression()

data class BinaryExpression(
        val operation: String,
        val left: Expression,
        val right: Expression
) : Expression()

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
) : Expression()

data class IfStatement(
        val expression: Expression,
        val thenStatements: List<AstNode>,
        val elseStatements: List<AstNode>
) : Expression()






