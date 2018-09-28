package io.dkozak.cimple

import io.dkozak.cimple.ast.TypeResolutionException
import org.junit.Test

class TypeSystemTest {

    @Test
    fun `sum two numbers`() {
        val input = """
            int a = 10;
            int b = 10;
            print a + b;
        """.trimIndent()

        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)
    }

    @Test(expected = TypeResolutionException::class)
    fun `sum number and string, should fail`() {
        val input = """
            int a = 10;
            string b = "ahoj";
            print a + b;
        """.trimIndent()

        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)
    }
}