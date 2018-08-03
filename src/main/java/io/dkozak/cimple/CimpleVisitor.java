// Generated from /home/dkozak/projects/cimple/src/main/kotlin/io/dkozak/cimple/Cimple.g4 by ANTLR 4.7
package io.dkozak.cimple;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CimpleVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CimpleParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(CimpleParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link CimpleParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(CimpleParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by the {@code varExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarExpr(CimpleParser.VarExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code binExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinExpr(CimpleParser.BinExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code notExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNotExpr(CimpleParser.NotExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code intConstant}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntConstant(CimpleParser.IntConstantContext ctx);

    /**
     * Visit a parse tree produced by the {@code bracketExpr}
     * labeled alternative in {@link CimpleParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBracketExpr(CimpleParser.BracketExprContext ctx);

    /**
     * Visit a parse tree produced by {@link CimpleParser#variableAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableAssignment(CimpleParser.VariableAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link CimpleParser#printStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintStatement(CimpleParser.PrintStatementContext ctx);

    /**
     * Visit a parse tree produced by the {@code if}
     * labeled alternative in {@link CimpleParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf(CimpleParser.IfContext ctx);

    /**
     * Visit a parse tree produced by the {@code ifElse}
     * labeled alternative in {@link CimpleParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfElse(CimpleParser.IfElseContext ctx);

    /**
     * Visit a parse tree produced by {@link CimpleParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(CimpleParser.BlockContext ctx);
}