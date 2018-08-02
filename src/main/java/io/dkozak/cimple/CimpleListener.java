// Generated from /home/dkozak/projects/cimple/src/main/kotlin/io/dkozak/cimple/Cimple.g4 by ANTLR 4.7
package io.dkozak.cimple;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CimpleParser}.
 */
public interface CimpleListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CimpleParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(CimpleParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(CimpleParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link CimpleParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(CimpleParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(CimpleParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(CimpleParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(CimpleParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link CimpleParser#variableAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterVariableAssignment(CimpleParser.VariableAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#variableAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitVariableAssignment(CimpleParser.VariableAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link CimpleParser#printStatement}.
     *
     * @param ctx the parse tree
     */
    void enterPrintStatement(CimpleParser.PrintStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#printStatement}.
     *
     * @param ctx the parse tree
     */
    void exitPrintStatement(CimpleParser.PrintStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code if}
     * labeled alternative in {@link CimpleParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIf(CimpleParser.IfContext ctx);

    /**
     * Exit a parse tree produced by the {@code if}
     * labeled alternative in {@link CimpleParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIf(CimpleParser.IfContext ctx);

    /**
     * Enter a parse tree produced by the {@code ifElse}
     * labeled alternative in {@link CimpleParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfElse(CimpleParser.IfElseContext ctx);

    /**
     * Exit a parse tree produced by the {@code ifElse}
     * labeled alternative in {@link CimpleParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfElse(CimpleParser.IfElseContext ctx);

    /**
     * Enter a parse tree produced by {@link CimpleParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(CimpleParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(CimpleParser.BlockContext ctx);
}