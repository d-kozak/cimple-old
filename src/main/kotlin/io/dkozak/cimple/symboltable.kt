package io.dkozak.cimple

import io.dkozak.cimple.typesystem.IntegerValue
import io.dkozak.cimple.typesystem.Value

interface Symbol

data class VariableSymbol(
        val variableName: String,
        var value: Value = IntegerValue(0)
) : Symbol


class SymbolTable {

    private val symbolTable: MutableList<MutableMap<String, Symbol>> = mutableListOf(mutableMapOf())

    operator fun get(name: String): Symbol? {
        var symbol: Symbol? = null
        for (i in symbolTable.size - 1 downTo 0) {
            symbol = symbolTable[i][name]
            if (symbol != null)
                return symbol
        }
        return symbol
    }

    operator fun set(name: String, symbol: Symbol) {
        symbolTable[symbolTable.size - 1][name] = symbol
    }

    fun push() {
        symbolTable.add(mutableMapOf())
    }

    fun pop() {
        symbolTable.removeAt(symbolTable.size - 1)
    }

    fun computeIfAbsent(name: String, block: () -> Symbol): Symbol {
        val lookup = get(name)
        return if (lookup != null) lookup
        else {
            val newSymbol = block()
            set(name, newSymbol)
            newSymbol
        }

    }

    fun forgetVariables() {
        if (symbolTable.size != 1) {
            throw IllegalStateException("At this point, there should be only one table, for top level functions")
        }
        val topLevelSymbolTable = symbolTable[0]
        val variableKeys = topLevelSymbolTable.entries.filter { it.value is VariableSymbol }
                .map { it.key }
        for (key in variableKeys) {
            topLevelSymbolTable.remove(key)
        }
    }
}