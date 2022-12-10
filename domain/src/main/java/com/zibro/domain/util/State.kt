package com.zibro.domain.util

sealed class State<out R> {
    data class Success<out T>(val data: T) : State<T>()
    data class Error(val error: Throwable) : State<Nothing>()
}

fun <T> State<T>.getValue(): T {
    return when(this){
        is State.Success -> this.data
        else -> throw (this as State.Error).error
    }
}