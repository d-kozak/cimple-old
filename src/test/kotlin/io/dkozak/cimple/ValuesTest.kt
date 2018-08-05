package io.dkozak.cimple

import io.dkozak.cimple.typesystem.DoubleValue
import org.junit.Test

class ValuesTest {


    @Test
    fun doubleOperations() {
        val left = DoubleValue(1.0)
        val right = DoubleValue(2.0)

        println(left % right)
    }
}