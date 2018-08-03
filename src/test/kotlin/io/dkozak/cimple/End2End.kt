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
        interpret(ast as Program)
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
        interpret(ast as Program)
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
        interpret(ast as Program)
    }


    @Test
    fun ifStatement() {
        val input = """
            a = 10;
            if(a >= 5){
                print a;
            }
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast as Program)
    }


    @Test
    fun ifStatementFalse() {
        val input = """
            a = 10;
            if(a >= 50){
                print a;
            }
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast as Program)
    }

    @Test
    fun ifElseStatement() {
        val input = """
            a = 10;
            if(a >= 5){
                print a;
            } else {
                print 666;
            }
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast as Program)
    }

    @Test
    fun ifElseStatementFalse() {
        val input = """
            a = 10;
            if(a >= 50){
                print a;
            } else {
                print 666;
            }
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast as Program)
    }

    @Test
    fun forLoop() {
        val input = """
            for(i = 0; i < 10 ; i = i + 1){
                print i;
            }
        """.trimIndent()
        val parseTree = parse(input)
        val ast = toAst(parseTree)
        interpret(ast as Program)
    }
}