package io.dkozak.cimple

import java.io.File

fun inputFromFile(filename: String): String = File("examples/" + filename + ".cimple").readText()