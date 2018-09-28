package io.dkozak.cimple.ast

sealed class VisitorError(val msg: String = "")

class TypeError(msg: String) : VisitorError(msg) {
    override fun toString(): String = "TypeError(msg=$msg)"
}

class ReferenceResolvingError(msg: String) : VisitorError(msg) {
    override fun toString(): String = "ReferenceResolvingError(msg=$msg)"
}

sealed class CimpleException(msg: String) : Throwable(msg)

class TypeResolutionException(msg: String) : CimpleException(msg)

class ReferenceResolvingException(msg: String) : CimpleException(msg)

