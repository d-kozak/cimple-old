package io.dkozak.cimple

import org.junit.Test

class End2End {

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

    @Test
    fun `Because 42 is always the answer`() {
        val input = """
            a = 10;
            b = 15 + 17;
            print a + b;
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast)
    }

    @Test
    fun logicalExpression() {
        val input = """
            a = 10;
            b = 15;
            print a > b;
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast)
    }
}