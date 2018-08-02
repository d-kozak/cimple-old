package io.dkozak.cimple

import org.junit.Test

class SimpleParsingTest {

    @Test
    fun assignAndPrint() {
        val input = """
            a = 10;
            print a;
        """.trimIndent()

        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast)
    }
}