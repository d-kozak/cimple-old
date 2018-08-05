package io.dkozak.cimple

sealed class Value {
    abstract operator fun plus(other: Value): Value
    abstract operator fun minus(other: Value): Value
    abstract operator fun times(other: Value): Value
    abstract operator fun div(other: Value): Value
    abstract operator fun rem(other: Value): Value
    abstract operator fun unaryMinus(): Value

    abstract override fun equals(other: Any?): Boolean
    abstract override fun hashCode(): Int

    abstract operator fun compareTo(other: Value): Int

    abstract fun and(other: Value): Value
    abstract fun or(other: Value): Value
    abstract fun not(): Value

    abstract fun isTrue(): Boolean
}

data class IntegerValue(
        val value: Int
) : Value() {
    override fun plus(other: Value) = IntegerValue(value + (other as IntegerValue).value)
    override fun minus(other: Value) = IntegerValue(value - (other as IntegerValue).value)
    override fun times(other: Value) = IntegerValue(value * (other as IntegerValue).value)
    override fun div(other: Value) = IntegerValue(value / (other as IntegerValue).value)
    override fun rem(other: Value) = IntegerValue(value % (other as IntegerValue).value)
    override fun unaryMinus(): Value = IntegerValue(-value)

    override fun compareTo(other: Value): Int = value.compareTo((other as IntegerValue).value)

    override fun and(other: Value): Value = if (isTrue() && (other as IntegerValue).isTrue()) IntegerValue(1) else IntegerValue(0)

    override fun or(other: Value): Value = if (isTrue() || (other as IntegerValue).isTrue()) IntegerValue(1) else IntegerValue(0)

    override fun not(): Value = if (isTrue()) IntegerValue(0) else IntegerValue(1)

    override fun toString(): String = value.toString()

    override fun isTrue(): Boolean = value != 0
}


data class DoubleValue(
        val value: Double
) : Value() {
    override fun plus(other: Value) = DoubleValue(value + (other as DoubleValue).value)
    override fun minus(other: Value) = DoubleValue(value - (other as DoubleValue).value)
    override fun times(other: Value) = DoubleValue(value * (other as DoubleValue).value)
    override fun div(other: Value) = DoubleValue(value / (other as DoubleValue).value)
    override fun rem(other: Value) = DoubleValue(value % (other as DoubleValue).value)
    override fun unaryMinus(): Value = DoubleValue(-value)

    override fun compareTo(other: Value): Int = value.compareTo((other as DoubleValue).value)

    override fun and(other: Value): Value = if (isTrue() && (other as DoubleValue).isTrue()) DoubleValue(1.0) else DoubleValue(0.0)

    override fun or(other: Value): Value = if (isTrue() || (other as DoubleValue).isTrue()) DoubleValue(1.0) else DoubleValue(0.0)

    override fun not(): Value = if (isTrue()) DoubleValue(0.0) else DoubleValue(1.0)

    override fun toString(): String = value.toString()

    override fun isTrue(): Boolean = value != 0.0
}

data class StringValue(
        val value: String
) : Value() {
    override fun plus(other: Value) = StringValue(value + (other as StringValue).value)
    override fun minus(other: Value) = throw UnsupportedOperationException()
    override fun times(other: Value) = throw UnsupportedOperationException()
    override fun div(other: Value) = throw UnsupportedOperationException()
    override fun rem(other: Value) = throw UnsupportedOperationException()
    override fun unaryMinus(): Value = throw UnsupportedOperationException()

    override fun compareTo(other: Value): Int = value.compareTo((other as StringValue).value)

    override fun and(other: Value): Value = throw UnsupportedOperationException()

    override fun or(other: Value): Value = throw UnsupportedOperationException()

    override fun not(): Value = throw UnsupportedOperationException()

    override fun toString(): String = value

    override fun isTrue(): Boolean = value.isNotEmpty()
}