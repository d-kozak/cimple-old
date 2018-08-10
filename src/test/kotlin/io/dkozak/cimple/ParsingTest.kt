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
    fun `One print assignment`() {
        val input = " 10;"

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

    /**
     * Parsing encoded as one expression :)
     */
    fun parse(input: String): Program =
            CimpleParser(CommonTokenStream(CimpleLexer(ANTLRInputStream(input)))).program().accept(AstCreatingVisitor()) as Program
}


