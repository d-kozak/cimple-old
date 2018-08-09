package io.dkozak.cimple.ast

import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.VariableSymbol


class ReferenceResolvingVisitor(
        symbolTable: SymbolTable
) : BaseAstRewritingVisitor(
        symbolTable
) {

    val errors = mutableListOf<String>()

    override fun visitUnresolvedFunctionCall(unresolvedFunctionCall: UnresolvedFunctionCall): AstNode {
        val function = symbolTable[unresolvedFunctionCall.functionName]
        return if (function != null) {
            if (function is FunctionDefinition) {
                if (function.formalParameters.size == unresolvedFunctionCall.arguments.size) {
                    FunctionCall(function, visitNodes(unresolvedFunctionCall.arguments) as List<Expression>)
                } else {
                    errors.add("Wrong number of arguments in function call ${unresolvedFunctionCall.functionName}")
                    unresolvedFunctionCall
                }
            } else {
                errors.add("Reference ${unresolvedFunctionCall.functionName} is not a function")
                unresolvedFunctionCall
            }
        } else {
            errors.add("Reference ${unresolvedFunctionCall.functionName} was not found")
            unresolvedFunctionCall
        }
    }

    override fun visitUnresolvedVariableReference(unresolvedVariableReference: UnresolvedVariableReference): AstNode {
        val symbol = symbolTable[unresolvedVariableReference.name]
        return if (symbol != null) {
            if (symbol is VariableSymbol) {
                VariableReference(symbol.variableName)
            } else {
                errors.add("Reference ${unresolvedVariableReference.name} is not a variable")
                unresolvedVariableReference
            }
        } else {
            errors.add("Variable ${unresolvedVariableReference.name} was not found")
            unresolvedVariableReference
        }
    }


    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): AstNode {

        symbolTable.push()
        functionDefinition.formalParameters = visitNodes(functionDefinition.formalParameters) as List<ParameterDefinition>
        for (parameter in functionDefinition.formalParameters) {
            symbolTable[parameter.name] = VariableSymbol(parameter.name)
        }
        functionDefinition.body = visitNodes(functionDefinition.body)
        symbolTable.pop()
        return functionDefinition
    }

}