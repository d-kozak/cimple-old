package io.dkozak.cimple.ast

import io.dkozak.cimple.CimpleBaseVisitor
import io.dkozak.cimple.CimpleParser
import io.dkozak.cimple.SymbolTable
import io.dkozak.cimple.typesystem.Type

class AstCreatingVisitor : CimpleBaseVisitor<AstNode>() {

    val symbolTable = SymbolTable()

    val errors = mutableListOf<String>()

    override fun visitProgram(ctx: CimpleParser.ProgramContext): AstNode {
        val nodes = ctx.statement()
                .map { it.accept(this) }
        return Program(nodes)
    }

    override fun visitFunctionDefinition(ctx: CimpleParser.FunctionDefinitionContext): AstNode {
        val name = ctx.name.text
        val params = if (ctx.parameters() != null)
            ctx.parameters().parameter().map { ParameterDefinition(it.name.text, Type.INT) }
        else emptyList()

        val statements = ctx.block().statement().map {
            it.accept(this)
        }

        val returnType = when (ctx.type?.text) {
            "int" -> Type.INT
            "double" -> Type.DOUBLE
            "string" -> Type.STRING
            null -> null
            else -> {
                errors.add("Function $name has invalid return type ${ctx.type?.text}")
                Type.INVALID
            }
        }

        val functionDefinition = FunctionDefinition(name, params, statements, returnType)
        symbolTable[name] = functionDefinition

        return functionDefinition
    }

    override fun visitFunctionCall(ctx: CimpleParser.FunctionCallContext): AstNode =
            UnresolvedFunctionCall(
                    ctx.ID().text,
                    ctx.arguments()?.expression()?.map(this::visitExpression) ?: listOf()
            )

    override fun visitReturnStatement(ctx: CimpleParser.ReturnStatementContext): AstNode = ReturnStatement(visitExpression(ctx.expression()))

    override fun visitStatement(ctx: CimpleParser.StatementContext): AstNode = ctx.getChild(0).accept(this) // ignore SEMICOLON

    override fun visitVariableAssignment(ctx: CimpleParser.VariableAssignmentContext): AstNode =
            VariableAssignment(VariableReference(ctx.ID().text), visitExpression(ctx.expression()))


    override fun visitVariableDefinition(ctx: CimpleParser.VariableDefinitionContext): AstNode {
        val type = when (ctx.type.text) {
            "int" -> Type.INT
            "double" -> Type.DOUBLE
            "string" -> Type.STRING
            else -> {
                errors.add("Variable ${ctx.name.text} has invalid type ${ctx.type.text}")
                Type.INVALID
            }
        }
        return VariableDefinition(VariableReference(ctx.name.text), visitExpression(ctx.expression()), type)
    }

    override fun visitInputStatement(ctx: CimpleParser.InputStatementContext): AstNode {
        val type = when (ctx.type.text) {
            "int" -> Type.INT
            "double" -> Type.DOUBLE
            "string" -> Type.STRING
            else -> {
                errors.add("Input ${ctx.name.text} has invalid type ${ctx.type.text}")
                Type.INVALID
            }
        }
        return InputStatement(ctx.name.text, type)
    }


    override fun visitPrintStatement(ctx: CimpleParser.PrintStatementContext): AstNode = PrintStatement(
            visitExpression(ctx.expression())
    )

    override fun visitIf(ctx: CimpleParser.IfContext): AstNode {
        val expression = visitExpression(ctx.expression())
        val block = ctx.block().statement().map { it.accept(this) }
        return IfStatement(expression, block, emptyList())
    }


    override fun visitIfElse(ctx: CimpleParser.IfElseContext): AstNode {
        val expression = visitExpression(ctx.expression())
        val thenBlock = ctx.block(0).statement().map { it.accept(this) }
        val elseBlock = ctx.block(1).statement().map { it.accept(this) }
        return IfStatement(expression, thenBlock, elseBlock)
    }

    override fun visitForLoop(ctx: CimpleParser.ForLoopContext): AstNode {
        val setup = ctx.setup.accept(this) as VariableDefinition
        val testExpression = visitExpression(ctx.expression())
        val increment = ctx.increment.accept(this) as VariableAssignment
        val statements = ctx.block().statement().map { it.accept(this) }
        return ForLoop(setup, testExpression, statements, increment)
    }

     fun visitExpression(it: CimpleParser.ExpressionContext) =
            ExpressionAstCreatingVisitor(errors)
                    .visit(it)



}
