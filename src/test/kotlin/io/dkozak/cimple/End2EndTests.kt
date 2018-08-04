package io.dkozak.cimple

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test


class End2EndTests {

    private lateinit var myPrintStream: OutputCatchingPrintStream

    @Before
    fun before() {
        myPrintStream = OutputCatchingPrintStream(System.out)
        System.setOut(myPrintStream)
    }

    @Test
    fun `functionCall no params`() {
        val input = """
            fn foo(){
                print 42;
            }
            foo();
        """.trimIndent()

        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = "42\n"
        assertEquals(expected, myPrintStream.programOutput)
    }

    @Test
    fun `functionCall use one input param`() {
        val input = """
            fn foo(x){
                print x;
            }
            foo(42);
        """.trimIndent()

        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = "42\n"
        assertEquals(expected, myPrintStream.programOutput)
    }

    @Test
    fun `functionCall use one input param and condition`() {
        val input = """
            fn foo(x){
                if(x > 9){
                    print 42;
                } else {
                    print 21;
                }
            }
            a = 10;
            foo(a);
        """.trimIndent()

        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = "42\n"
        assertEquals(expected, myPrintStream.programOutput)
    }


    @Test
    fun assignAndPrint() {
        val input = """
            a = 10;
            print a;
        """.trimIndent()

        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = "10\n"
        assertEquals(expected, myPrintStream.programOutput)
    }

    @Test
    fun `Because 42 is always the answer`() {
        val input = """
            a = 10;
            b = 15 + 17;
            print a + b;
        """.trimIndent()
        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)
        val expected = "42\n"
        assertEquals(expected, myPrintStream.programOutput)
    }

    @Test
    fun logicalExpression() {
        val input = """
            a = 10;
            b = 15;
            print a > b;
        """.trimIndent()
        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)
        val expected = "0\n"
        assertEquals(expected, myPrintStream.programOutput)
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
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)
        val expected = "10\n"
        assertEquals(expected, myPrintStream.programOutput)
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
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = ""
        assertEquals(expected, myPrintStream.programOutput)
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
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = "10\n"
        assertEquals(expected, myPrintStream.programOutput)
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
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = "666\n"
        assertEquals(expected, myPrintStream.programOutput)
    }

    @Test
    fun forLoop() {
        val input = """
            for(i = 0; i < 10 ; i = i + 1){
                print i;
            }
        """.trimIndent()
        val parseTree = parse(input)
        val (ast, symbolTable) = toAst(parseTree)
        interpret(ast, symbolTable)

        val expected = """
            0
            1
            2
            3
            4
            5
            6
            7
            8
            9

        """.trimIndent()
        assertEquals(expected, myPrintStream.programOutput)

    }

    @Test(expected = IllegalArgumentException::class)
    fun `invalidForLoop missing semicolon between setup and testCondition`() {
        val input = """
            for(i = 0 i < 10 ; i = i + 1){
                print i;
            }
        """.trimIndent()
        val parseTree = parse(input)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `invalidIf typo in ifs instread of if`() {
        val input = """
            ifs(a){
                print 10;
            }
        """.trimIndent()
        val parseTree = parse(input)
    }
}