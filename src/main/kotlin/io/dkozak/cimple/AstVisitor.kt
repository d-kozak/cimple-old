package io.dkozak.cimple

interface AstVisitor<T> {
    fun visitProgram(program: Program): T
    fun visitVariableReference(variableReference: VariableReference): T
    fun visitIntegerLiteral(integerLiteral: IntegerLiteral): T
    fun visitDoubleLiteral(doubleLiteral: DoubleLiteral): T
    fun visitStringLiteral(stringLiteral: StringLiteral): T
    fun visitBinaryExpression(binaryExpression: BinaryExpression): T
    fun visitUnaryExpression(unaryExpression: UnaryExpression): T
    fun visitVariableAssignment(variableAssignment: VariableAssignment): T
    fun visitPrintStatement(printStatement: PrintStatement): T
    fun visitInputStatement(inputStatement: InputStatement): T
    fun visitIfStatement(ifStatement: IfStatement): T
    fun visitReturnStatement(returnStatement: ReturnStatement): T
    fun visitForLoop(forLoop: ForLoop): T
    fun visitFunctionDefinition(functionDefinition: FunctionDefinition): T
    fun visitFunctionCall(functionCall: FunctionCall): T

    fun visitNodes(nodes: List<AstNode>) {
        for (statement in nodes) {
            statement.accept(this)
        }
    }

    fun visit(node: AstNode) {
        node.accept(this)
    }
}

interface AstVisitee {
    fun <T> accept(visitor: AstVisitor<T>): T
}