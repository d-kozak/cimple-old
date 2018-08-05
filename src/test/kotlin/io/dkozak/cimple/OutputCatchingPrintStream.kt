package io.dkozak.cimple

import java.io.OutputStream
import java.io.PrintStream

class OutputCatchingPrintStream(outputStream: OutputStream) : PrintStream(outputStream) {

    private val messages = mutableListOf<String>()

    private var isEnabled = true

    override fun println(input: Any?) {
        if (isEnabled) messages.add(input.toString()) else super.println(input)

    }

    override fun println(message: String) {
        if (isEnabled) messages.add(message) else super.println(message)

    }

    override fun println(num: Int) {
        if (isEnabled) messages.add(num.toString()) else super.println(num)

    }

    override fun println(num: Double) {
        if (isEnabled) messages.add(num.toString()) else super.println(num)

    }

    fun disable() {
        isEnabled = false
    }

    val programOutput: String
        get() = messages.map { it + "\n" }.joinToString(separator = "")

}