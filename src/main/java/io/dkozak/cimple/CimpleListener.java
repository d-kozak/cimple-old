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
     * Enter a parse tree produced by the {@code varExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterVarExpr(CimpleParser.VarExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code varExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitVarExpr(CimpleParser.VarExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code binExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterBinExpr(CimpleParser.BinExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code binExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitBinExpr(CimpleParser.BinExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code notExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNotExpr(CimpleParser.NotExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code notExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNotExpr(CimpleParser.NotExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code intConstant}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterIntConstant(CimpleParser.IntConstantContext ctx);

    /**
     * Exit a parse tree produced by the {@code intConstant}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitIntConstant(CimpleParser.IntConstantContext ctx);

    /**
     * Enter a parse tree produced by the {@code bracketExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterBracketExpr(CimpleParser.BracketExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code bracketExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitBracketExpr(CimpleParser.BracketExprContext ctx);

    /**
     * Enter a parse tree produced by {@link CimpleParser#forLoop}.
     *
     * @param ctx the parse tree
     */
    void enterForLoop(CimpleParser.ForLoopContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#forLoop}.
     *
     * @param ctx the parse tree
     */
    void exitForLoop(CimpleParser.ForLoopContext ctx);

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
     * Enter a parse tree produced by {@link CimpleParser#inputStatement}.
     *
     * @param ctx the parse tree
     */
    void enterInputStatement(CimpleParser.InputStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link CimpleParser#inputStatement}.
     *
     * @param ctx the parse tree
     */
    void exitInputStatement(CimpleParser.InputStatementContext ctx);

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