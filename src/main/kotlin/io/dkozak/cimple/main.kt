package io.dkozak.cimple

import io.dkozak.cimple.ast.AstCreatingVisitor
import io.dkozak.cimple.ast.Program
import io.dkozak.cimple.ast.ReferenceResolvingVisitor
import io.dkozak.cimple.interpret.InterpretingAstVisitor
import io.dkozak.cimple.typesystem.TypePromotingVisitor
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("Expected one argument, file to interpret")
        System.exit(1)
    }
    val input = File(args[0]).readText()
    val parseTree = parse(input)
    val (ast, symbolTable) = toAst(parseTree)
    interpret(ast, symbolTable)
}

fun parse(input: String): CimpleParser.ProgramContext {
    val lexer = CimpleLexer(ANTLRInputStream(input))
    val stream = CommonTokenStream(lexer)
    val parser = CimpleParser(stream)

    val errorListener = AntlrErrorHandler()
    parser.removeErrorListeners()
    parser.addErrorListener(errorListener)

    val ast = parser.program()

    if (errorListener.errors.isNotEmpty()) {
        for (msg in errorListener.errors) {
            System.err.println(msg)
        }
        throw IllegalArgumentException()
    } else {
        return ast
    }
}

fun toAst(parseTree: ParseTree): Pair<Program, SymbolTable> {
    val astCreator = AstCreatingVisitor()
    var ast = astCreator.visit(parseTree) as Program
    val symbolTable = astCreator.symbolTable

    if (astCreator.errors.isNotEmpty()) {
        for (msg in astCreator.errors) {
            System.err.println(msg)
        }
        throw IllegalArgumentException()
    }


    // only function symbols should be passed into the interpreter
    symbolTable.forgetVariables()

    val visitors = listOf(ReferenceResolvingVisitor(symbolTable), TypePromotingVisitor(symbolTable))

    for (visitor in visitors) {
        ast = visitor.visit(ast) as Program

        if (visitor.errors.isNotEmpty()) {
            for (msg in visitor.errors) {
                System.err.println(msg)
            }
            throw IllegalArgumentException()
        }
    }

    return ast to symbolTable
}


fun interpret(program: Program, symbolTable: SymbolTable) =
        InterpretingAstVisitor(symbolTable).visitProgram(program)


class AntlrErrorHandler : BaseErrorListener() {

    val errors: MutableList<String> = mutableListOf()

    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException?) {
        errors.add(msg)
    }
}




