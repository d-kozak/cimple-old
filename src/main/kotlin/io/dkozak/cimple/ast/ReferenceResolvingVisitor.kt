package io.dkozak.cimple.ast

import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.VariableSymbol


open class BaseAstRewritingVisitor(
        val symbolTable: SymbolTable
) : AstVisitor<AstNode> {

    override fun visitProgram(program: Program): AstNode =
            Program(
                    program.statements.map(this::visit)
            )

    override fun visitIntegerLiteral(integerLiteral: IntegerLiteral): AstNode = integerLiteral

    override fun visitDoubleLiteral(doubleLiteral: DoubleLiteral): AstNode = doubleLiteral

    override fun visitStringLiteral(stringLiteral: StringLiteral): AstNode = stringLiteral

    override fun visitVariableReference(variableReference: VariableReference): AstNode = variableReference

    override fun visitUnresolvedVariableReference(unresolvedVariableReference: UnresolvedVariableReference): AstNode = unresolvedVariableReference

    override fun visitBinaryExpression(binaryExpression: BinaryExpression): AstNode =
            BinaryExpression(
                    binaryExpression.operation,
                    visit(binaryExpression.left) as Expression,
                    visit(binaryExpression.right) as Expression
            )

    override fun visitUnaryExpression(unaryExpression: UnaryExpression): AstNode =
            UnaryExpression(
                    unaryExpression.operation,
                    visit(unaryExpression.expression) as Expression
            )

    override fun visitVariableAssignment(variableAssignment: VariableAssignment): AstNode {
        symbolTable[variableAssignment.variable.name] = VariableSymbol(variableAssignment.variable.name)
        return VariableAssignment(
                visit(variableAssignment.variable) as VariableReference,
                visit(variableAssignment.expression) as Expression
        )
    }

    override fun visitPrintStatement(printStatement: PrintStatement): AstNode =
            PrintStatement(
                    visit(printStatement.expression) as Expression
            )

    override fun visitInputStatement(inputStatement: InputStatement): AstNode = inputStatement

    override fun visitIfStatement(ifStatement: IfStatement): AstNode {
        val condition = visit(ifStatement.expression) as Expression
        symbolTable.push()
        val thenStatements = visitNodes(ifStatement.thenStatements)
        symbolTable.pop()
        symbolTable.push()
        val elseStatements = visitNodes(ifStatement.elseStatements)
        symbolTable.pop()
        return IfStatement(condition, thenStatements, elseStatements)
    }

    override fun visitReturnStatement(returnStatement: ReturnStatement): AstNode =
            ReturnStatement(
                    visit(returnStatement.expression) as Expression
            )

    override fun visitForLoop(forLoop: ForLoop): AstNode {
        symbolTable.push()
        val setup = visit(forLoop.setup) as VariableAssignment
        val testCondition = visit(forLoop.testExpression) as Expression
        val statements = visitNodes(forLoop.statements)
        val increment = visit(forLoop.increment) as VariableAssignment
        symbolTable.pop()
        return ForLoop(
                setup,
                testCondition,
                statements,
                increment
        )
    }

    override fun visitFunctionDefinition(functionDefinition: FunctionDefinition): AstNode {

        symbolTable.push()
        val parameters = visitNodes(functionDefinition.formalParameters) as List<ParameterDefinition>
        for (parameter in parameters) {
            symbolTable[parameter.name] = VariableSymbol(parameter.name)
        }
        val body = visitNodes(functionDefinition.body)
        symbolTable.pop()
        return FunctionDefinition(
                functionDefinition.name,
                parameters,
                body
        ).also { symbolTable[functionDefinition.name] = it }
    }

    override fun visitParameterDefinition(parameterDefinition: ParameterDefinition): AstNode = parameterDefinition

    override fun visitFunctionCall(functionCall: FunctionCall): AstNode =
            FunctionCall(
                    functionCall.function,
                    visitNodes(functionCall.arguments) as List<Expression>
            )

    override fun visitUnresolvedFunctionCall(unresolvedFunctionCall: UnresolvedFunctionCall): AstNode =
            UnresolvedFunctionCall(
                    unresolvedFunctionCall.functionName,
                    visitNodes(unresolvedFunctionCall.arguments) as List<Expression>
            )
}

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