package io.dkozak.cimple

import io.dkozak.cimple.ast.*
import io.dkozak.cimple.typesystem.Type
import junit.framework.TestCase.assertEquals
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test

/**
 * Tests the the front end of the interpret: parsing text into ast
 * @author dkozak
 */
class ParsingTest {

    @Test
    fun `One variable assignment`() {
        val input = "x = 10;"

        val ast = parse(input)

        val expected = Program(
                listOf(
                        VariableAssignment(
                                VariableReference("x"),
                                IntegerLiteral(10)
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One variable definition`() {
        val input = "int x = 10;"

        val ast = parse(input)

        val expected = Program(
                listOf(
                        VariableDefinition(
                                VariableReference("x"),
                                IntegerLiteral(10),
                                Type.INT
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One print statement`() {
        val input = "print 10;"

        val ast = parse(input)

        val expected = Program(
                listOf(
                        PrintStatement(
                                IntegerLiteral(10)
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One input statement`() {
        val input = "input int x;"

        val ast = parse(input)

        val expected = Program(
                listOf(
                        InputStatement(
                                "x",
                                Type.INT
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One print assignment`() {
        val input = "print 10;"

        val ast = parse(input)

        val expected = Program(
                listOf(
                        PrintStatement(
                                IntegerLiteral(10)
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One return assignment`() {
        val input = "return 10;"

        val ast = parse(input)

        val expected = Program(
                listOf(
                        ReturnStatement(
                                IntegerLiteral(10)
                        )
                )
        )
        assertEquals(expected, ast)
    }


    @Test
    fun `One if statement`() {
        val input = """
            if(a == b){
                print a;
            }
        """.trimIndent()

        val ast = parse(input)

        val expected = Program(
                listOf(
                        IfStatement(
                                condition = BinaryExpression(Operation.EQUALS, UnresolvedVariableReference("a"), UnresolvedVariableReference("b")),
                                thenStatements = listOf(
                                        PrintStatement(UnresolvedVariableReference("a"))
                                ),
                                elseStatements = emptyList()
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One if else statement`() {
        val input = """
            if(a == b){
                print a;
            } else {
                string c = "foo";
            }
        """.trimIndent()

        val ast = parse(input)

        val expected = Program(
                listOf(
                        IfStatement(
                                condition = BinaryExpression(Operation.EQUALS, UnresolvedVariableReference("a"), UnresolvedVariableReference("b")),
                                thenStatements = listOf(
                                        PrintStatement(UnresolvedVariableReference("a"))
                                ),
                                elseStatements = listOf(
                                        VariableDefinition(
                                                VariableReference("c"),
                                                StringLiteral("foo"),
                                                Type.STRING
                                        )
                                )
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `One foor loop`() {
        val input = """
            for(int i = 0 ; i < 10 ; i = i + 1){
                print i;
            }
        """.trimIndent()

        val ast = parse(input)

        val expected = Program(
                listOf(
                        ForLoop(
                                setup = VariableDefinition(
                                        VariableReference("i"), IntegerLiteral(0), Type.INT
                                ), testExpression = BinaryExpression(
                                Operation.LT,
                                UnresolvedVariableReference("i"),
                                IntegerLiteral(10)
                        ), statements = listOf(
                                PrintStatement(UnresolvedVariableReference("i"))
                        ), increment = VariableAssignment(
                                VariableReference("i"), // TODO should be unresolved reference
                                BinaryExpression(Operation.PLUS, UnresolvedVariableReference("i"), IntegerLiteral(1))
                        )

                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun `Function definition and call`() {
        val input = """
            fn foo(int x) : int{
                print x;
                return x * 2;
            }
            print foo(5);
        """.trimIndent()

        val ast = parse(input)

        val expected = Program(
                listOf(
                        FunctionDefinition(
                                name = "foo",
                                formalParameters = listOf(ParameterDefinition("x", Type.INT)),
                                body = listOf(
                                        PrintStatement(UnresolvedVariableReference("x")),
                                        ReturnStatement(BinaryExpression(Operation.MULT, UnresolvedVariableReference("x"), IntegerLiteral(2)))
                                ),
                                returnType = Type.INT
                        ),
                        PrintStatement(
                                UnresolvedFunctionCall("foo", listOf(IntegerLiteral(5)))
                        )
                )
        )
        assertEquals(expected, ast)
    }

    @Test
    fun testExpressions() {
        assertEquals(BinaryExpression(Operation.PLUS, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 + 3"))
        assertEquals(BinaryExpression(Operation.MINUS, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 - 3"))
        assertEquals(BinaryExpression(Operation.MULT, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 * 3"))
        assertEquals(BinaryExpression(Operation.DIV, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 / 3"))
        assertEquals(BinaryExpression(Operation.MOD, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 % 3"))

        assertEquals(BinaryExpression(Operation.EQUALS, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 == 3"))
        assertEquals(BinaryExpression(Operation.NOT_EQUALS, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 != 3"))
        assertEquals(BinaryExpression(Operation.GT, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 > 3"))
        assertEquals(BinaryExpression(Operation.GE, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 >= 3"))
        assertEquals(BinaryExpression(Operation.LT, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 < 3"))
        assertEquals(BinaryExpression(Operation.LE, IntegerLiteral(1), IntegerLiteral(3)), parseExpression("1 <= 3"))
    }

    @Test
    fun `Put it all together and parse fibonacci`() {
        val input = """
            fn fib(int i) : int{
                if(i < 2){
                    return 1;
                } else {
                    return fib(i - 1)  + fib(i - 2);
                }
            }

            input int i;

            for(int j = 0; j < i ; j = j+1){
                int res = fib(j);
                print res;
        }""".trimIndent()

        val ast = parse(input)

        val expected = Program(
                listOf(
                        FunctionDefinition("fib", listOf(ParameterDefinition("i", Type.INT)),
                                listOf(
                                        IfStatement(
                                                condition = BinaryExpression(Operation.LT, UnresolvedVariableReference("i"), IntegerLiteral(2)),
                                                thenStatements = listOf(ReturnStatement(IntegerLiteral(1))),
                                                elseStatements = listOf(ReturnStatement(BinaryExpression(
                                                        Operation.PLUS,
                                                        UnresolvedFunctionCall("fib", listOf(BinaryExpression(Operation.MINUS, UnresolvedVariableReference("i"), IntegerLiteral(1)))),
                                                        UnresolvedFunctionCall("fib", listOf(BinaryExpression(Operation.MINUS, UnresolvedVariableReference("i"), IntegerLiteral(2))))
                                                )))
                                        )
                                ),
                                Type.INT
                        ),
                        InputStatement("i", Type.INT),
                        ForLoop(
                                setup = VariableDefinition(VariableReference("j"), IntegerLiteral(0), Type.INT),
                                testExpression = BinaryExpression(Operation.LT, UnresolvedVariableReference("j"), UnresolvedVariableReference("i")),
                                //TODO fix increment = VariableAssignment(UnresolvedVariableReference("j"))
                                increment = VariableAssignment(VariableReference("j"), BinaryExpression(Operation.PLUS, UnresolvedVariableReference("j"), IntegerLiteral(1))),
                                statements = listOf(
                                        VariableDefinition(VariableReference("res"), UnresolvedFunctionCall("fib", listOf(UnresolvedVariableReference("j"))), Type.INT),
                                        PrintStatement(UnresolvedVariableReference("res"))
                                )
                        )
                )
        )

        assertEquals(expected, ast)
    }

    /**
     * Parsing encoded as one expression :)
     */
    fun parse(input: String): Program =
            CimpleParser(CommonTokenStream(CimpleLexer(ANTLRInputStream(input)))).program().accept(AstCreatingVisitor()) as Program

    fun parseExpression(input: String): Expression {
        val parseTree = CimpleParser(CommonTokenStream(CimpleLexer(ANTLRInputStream(input)))).expression()
        val ast = AstCreatingVisitor().visitExpression(parseTree)
        return ast as Expression
    }
}


