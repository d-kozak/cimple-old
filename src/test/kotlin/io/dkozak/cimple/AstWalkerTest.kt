package io.dkozak.cimple

import io.dkozak.cimple.astwalk.DumpListener
import io.dkozak.cimple.astwalk.walk
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class AstWalkerTest {

    private lateinit var myPrintStream: OutputCatchingPrintStream

    @Before
    fun before() {
        myPrintStream = OutputCatchingPrintStream(System.out)
        System.setOut(myPrintStream)
    }


    @Test
    fun fib() {
        val input = inputFromFile("fib10")

        val ast = parse(input)
        val (program, symbolTable) = toAst(ast)
        walk(DumpListener(), program)

        val expected = """
Program(statements=[FunctionDefinition(name=fib, formalParameters=[VariableReference(name=i)], body=[IfStatement(expression=BinaryExpression(operation=LT, left=VariableReference(name=i), right=IntegerLiteral(value=2)), thenStatements=[ReturnStatement(expression=IntegerLiteral(value=1))], elseStatements=[ReturnStatement(expression=BinaryExpression(operation=PLUS, left=FunctionCall(function=fib,argsCount=1), right=FunctionCall(function=fib,argsCount=1)))])]), VariableAssignment(variable=VariableReference(name=i), expression=IntegerLiteral(value=10)), ForLoop(setup=VariableAssignment(variable=VariableReference(name=j), expression=IntegerLiteral(value=0)), testExpression=BinaryExpression(operation=LT, left=VariableReference(name=j), right=VariableReference(name=i)), statements=[VariableAssignment(variable=VariableReference(name=res), expression=FunctionCall(function=fib,argsCount=1)), PrintStatement(expression=VariableReference(name=res))], increment=VariableAssignment(variable=VariableReference(name=j), expression=BinaryExpression(operation=PLUS, left=VariableReference(name=j), right=IntegerLiteral(value=1))))])
FunctionDefinition(name=fib, formalParameters=[VariableReference(name=i)], body=[IfStatement(expression=BinaryExpression(operation=LT, left=VariableReference(name=i), right=IntegerLiteral(value=2)), thenStatements=[ReturnStatement(expression=IntegerLiteral(value=1))], elseStatements=[ReturnStatement(expression=BinaryExpression(operation=PLUS, left=FunctionCall(function=fib,argsCount=1), right=FunctionCall(function=fib,argsCount=1)))])])
VariableReference(name=i)
IfStatement(expression=BinaryExpression(operation=LT, left=VariableReference(name=i), right=IntegerLiteral(value=2)), thenStatements=[ReturnStatement(expression=IntegerLiteral(value=1))], elseStatements=[ReturnStatement(expression=BinaryExpression(operation=PLUS, left=FunctionCall(function=fib,argsCount=1), right=FunctionCall(function=fib,argsCount=1)))])
BinaryExpression(operation=LT, left=VariableReference(name=i), right=IntegerLiteral(value=2))
VariableReference(name=i)
IntegerLiteral(value=2)
ReturnStatement(expression=IntegerLiteral(value=1))
IntegerLiteral(value=1)
ReturnStatement(expression=BinaryExpression(operation=PLUS, left=FunctionCall(function=fib,argsCount=1), right=FunctionCall(function=fib,argsCount=1)))
BinaryExpression(operation=PLUS, left=FunctionCall(function=fib,argsCount=1), right=FunctionCall(function=fib,argsCount=1))
FunctionCall(function=fib,argsCount=1)
BinaryExpression(operation=MINUS, left=VariableReference(name=i), right=IntegerLiteral(value=1))
VariableReference(name=i)
IntegerLiteral(value=1)
FunctionCall(function=fib,argsCount=1)
BinaryExpression(operation=MINUS, left=VariableReference(name=i), right=IntegerLiteral(value=2))
VariableReference(name=i)
IntegerLiteral(value=2)
VariableAssignment(variable=VariableReference(name=i), expression=IntegerLiteral(value=10))
VariableReference(name=i)
IntegerLiteral(value=10)
ForLoop(setup=VariableAssignment(variable=VariableReference(name=j), expression=IntegerLiteral(value=0)), testExpression=BinaryExpression(operation=LT, left=VariableReference(name=j), right=VariableReference(name=i)), statements=[VariableAssignment(variable=VariableReference(name=res), expression=FunctionCall(function=fib,argsCount=1)), PrintStatement(expression=VariableReference(name=res))], increment=VariableAssignment(variable=VariableReference(name=j), expression=BinaryExpression(operation=PLUS, left=VariableReference(name=j), right=IntegerLiteral(value=1))))
VariableAssignment(variable=VariableReference(name=j), expression=IntegerLiteral(value=0))
VariableReference(name=j)
IntegerLiteral(value=0)
BinaryExpression(operation=LT, left=VariableReference(name=j), right=VariableReference(name=i))
VariableReference(name=j)
VariableReference(name=i)
VariableAssignment(variable=VariableReference(name=j), expression=BinaryExpression(operation=PLUS, left=VariableReference(name=j), right=IntegerLiteral(value=1)))
VariableReference(name=j)
BinaryExpression(operation=PLUS, left=VariableReference(name=j), right=IntegerLiteral(value=1))
VariableReference(name=j)
IntegerLiteral(value=1)
VariableAssignment(variable=VariableReference(name=res), expression=FunctionCall(function=fib,argsCount=1))
VariableReference(name=res)
FunctionCall(function=fib,argsCount=1)
VariableReference(name=j)
PrintStatement(expression=VariableReference(name=res))
VariableReference(name=res)

        """.trimIndent()

        assertEquals(expected, myPrintStream.programOutput)
    }


}