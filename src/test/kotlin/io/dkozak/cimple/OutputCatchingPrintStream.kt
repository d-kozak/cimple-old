package io.dkozak.cimple

import java.io.OutputStream
import java.io.PrintStream

class OutputCatchingPrintStream(outputStream: OutputStream) : PrintStream(outputStream) {

    private val messages = mutableListOf<String>()

    override fun println(input: Any?) {
        messages.add(input.toString())
    }

    override fun println(message: String) {
        messages.add(message)
    }

    override fun println(num: Int) {
        messages.add(num.toString())
    }

    override fun println(num: Double) {
        messages.add(num.toString())
    }

    val programOutput: String
        get() = messages.map { it + "\n" }.joinToString(separator = "")

}