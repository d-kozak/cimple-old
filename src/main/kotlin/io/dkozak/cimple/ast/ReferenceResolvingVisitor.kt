package io.dkozak.cimple.ast

import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.VariableSymbol


class ReferenceResolvingVisitor(
        symbolTable: SymbolTable
) : BaseAstRewritingVisitor(
        symbolTable
) {

    override fun visitUnresolvedFunctionCall(unresolvedFunctionCall: UnresolvedFunctionCall): AstNode {
        val function = symbolTable[unresolvedFunctionCall.functionName]
        return if (function != null) {
            if (function is FunctionDefinition) {
                if (function.formalParameters.size == unresolvedFunctionCall.arguments.size) {
                    val functionCall = FunctionCall(function, visitNodes(unresolvedFunctionCall.arguments) as List<Expression>)
                    if (function.returnType != null) {
                        functionCall.type = function.returnType
                    }
                    functionCall
                } else {
                    errors.add(ReferenceResolvingError("Wrong number of arguments in function call ${unresolvedFunctionCall.functionName}"))
                    unresolvedFunctionCall
                }
            } else {
                errors.add(ReferenceResolvingError("Reference ${unresolvedFunctionCall.functionName} is not a function"))
                unresolvedFunctionCall
            }
        } else {
            errors.add(ReferenceResolvingError("Reference ${unresolvedFunctionCall.functionName} was not found"))
            unresolvedFunctionCall
        }
    }

    override fun visitUnresolvedVariableReference(unresolvedVariableReference: UnresolvedVariableReference): AstNode {
        val symbol = symbolTable[unresolvedVariableReference.name]
        return if (symbol != null) {
            if (symbol is VariableSymbol) {
                val variableReference = VariableReference(symbol.variableName)
                variableReference.type = symbol.type
                variableReference
            } else {
                errors.add(ReferenceResolvingError("Reference ${unresolvedVariableReference.name} is not a variable"))
                unresolvedVariableReference
            }
        } else {
            errors.add(ReferenceResolvingError("Variable ${unresolvedVariableReference.name} was not found"))
            unresolvedVariableReference
        }
    }


    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): AstNode {

        symbolTable.push()
        functionDefinition.formalParameters = visitNodes(functionDefinition.formalParameters) as List<ParameterDefinition>
        for (parameter in functionDefinition.formalParameters) {
            symbolTable[parameter.name] = VariableSymbol(parameter.name, parameter.type)
        }
        functionDefinition.body = visitNodes(functionDefinition.body)
        symbolTable.pop()
        return functionDefinition
    }

}