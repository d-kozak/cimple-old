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
                                condition = BinaryExpression(Operation.EQUALS,UnresolvedVariableReference("a"),UnresolvedVariableReference("b")),
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
                                condition = BinaryExpression(Operation.EQUALS,UnresolvedVariableReference("a"),UnresolvedVariableReference("b")),
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
                                        VariableReference("i"),IntegerLiteral(0),Type.INT
                                ), testExpression = BinaryExpression(
                                    Operation.LT,
                                        UnresolvedVariableReference("i"),
                                        IntegerLiteral(10)
                                ), statements = listOf(
                                        PrintStatement(UnresolvedVariableReference("i"))
                                ), increment = VariableAssignment(
                                   VariableReference("i"), // TODO should be unresolved reference
                                    BinaryExpression(Operation.PLUS,UnresolvedVariableReference("i"),IntegerLiteral(1))
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
}


