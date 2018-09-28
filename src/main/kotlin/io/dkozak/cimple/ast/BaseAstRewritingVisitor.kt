package io.dkozak.cimple.ast

import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.VariableSymbol

open class BaseAstRewritingVisitor(
        val symbolTable: SymbolTable,
        val errors: MutableList<VisitorError> = mutableListOf()
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

    override fun visitVariableDefinition(variableDefinition: VariableDefinition): AstNode {
        symbolTable[variableDefinition.variable.name] = VariableSymbol(variableDefinition.variable.name, variableDefinition.type)
        return VariableDefinition(
                visit(variableDefinition.variable) as VariableReference,
                visit(variableDefinition.expression) as Expression,
                variableDefinition.type
        )
    }

    override fun visitVariableAssignment(variableAssignment: VariableAssignment): AstNode = VariableAssignment(
            visit(variableAssignment.variable) as VariableReference,
            visit(variableAssignment.expression) as Expression
    )


    override fun visitPrintStatement(printStatement: PrintStatement): AstNode =
            PrintStatement(
                    visit(printStatement.expression) as Expression
            )

    override fun visitInputStatement(inputStatement: InputStatement): AstNode = inputStatement

    override fun visitIfStatement(ifStatement: IfStatement): AstNode {
        val condition = visit(ifStatement.condition) as Expression
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
        val setup = visit(forLoop.setup) as VariableDefinition
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
            symbolTable[parameter.name] = VariableSymbol(parameter.name, parameter.type)
        }
        val body = visitNodes(functionDefinition.body)
        symbolTable.pop()
        return FunctionDefinition(
                functionDefinition.name,
                parameters,
                body,
                functionDefinition.returnType
        ).also { symbolTable[functionDefinition.name] = it }
    }

    override fun visitParameterDefinition(parameterDefinition: ParameterDefinition): AstNode = parameterDefinition

    override fun visitFunctionCall(functionCall: FunctionCall): AstNode {
        val result = FunctionCall(
                functionCall.function,
                visitNodes(functionCall.arguments) as List<Expression>
        )
        result.type = functionCall.type
        return result
    }

    override fun visitUnresolvedFunctionCall(unresolvedFunctionCall: UnresolvedFunctionCall): AstNode =
            UnresolvedFunctionCall(
                    unresolvedFunctionCall.functionName,
                    visitNodes(unresolvedFunctionCall.arguments) as List<Expression>
            )
}