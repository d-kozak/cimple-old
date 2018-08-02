package io.dkozak.cimple

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("Expected one argument, file to interpret")
    }
    val input = File(args[0]).readText()
    val parseTree = parse(input)
    val ast = toAst(parseTree)
    interpret(ast as Program)
}

fun parse(input: String): CimpleParser.ProgramContext {
    val lexer = CimpleLexer(ANTLRInputStream(input))
    val stream = CommonTokenStream(lexer)
    val parser = CimpleParser(stream)
    return parser.program()
}

fun toAst(parseTree: ParseTree) = AstCreatingVisitor().visit(parseTree)


fun interpret(program: Program) =
        InterpretingVisitor().start(program)




