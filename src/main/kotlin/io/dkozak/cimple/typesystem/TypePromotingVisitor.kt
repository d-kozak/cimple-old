package io.dkozak.cimple.typesystem

import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.ast.*

class TypePromotingVisitor(
        symbolTable: SymbolTable
) : BaseAstRewritingVisitor(symbolTable) {

    override fun visitBinaryExpression(binaryExpression: BinaryExpression): AstNode {
        val left = visit(binaryExpression.left) as Expression
        val right = visit(binaryExpression.right) as Expression

        val type = computeType(left.type, right.type)
        if (type == Type.INVALID) {
            errors.add("Type eror in " + binaryExpression)
        }

        val result = BinaryExpression(binaryExpression.operation, left, right)
        result.type = type
        return result
    }


    override fun visitUnaryExpression(unaryExpression: UnaryExpression): AstNode {
        val expression = visit(unaryExpression.expression) as Expression
        val result = UnaryExpression(unaryExpression.operation, expression)
        result.type = expression.type
        return result
    }

    fun computeType(left: Type, right: Type): Type =
            when {
                left == Type.INT && right == Type.INT -> Type.INT
// TODO implicit type casts
//                left == Type.DOUBLE && right == Type.INT -> Type.DOUBLE
//                left == Type.INT && right == Type.DOUBLE -> Type.DOUBLE
                left == Type.DOUBLE && right == Type.DOUBLE -> Type.DOUBLE
                left == Type.STRING && right == Type.STRING -> Type.STRING
                left == Type.INVALID || right == Type.INVALID -> Type.INVALID
                else -> Type.INVALID
            }
}


class TypeCastingVisitor(
        private val type: Type,
        symbolTable: SymbolTable
) : BaseAstRewritingVisitor(symbolTable) {

    // TODO add type cast nodes to AST
}

