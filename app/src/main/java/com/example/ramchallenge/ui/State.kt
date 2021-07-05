package com.example.ramchallenge.ui

sealed class State<T> {
    class Loading<T>: State<T>()
    class Empty<T>: State<T>()
    class Success<T>(val data:T? =null): State<T>()
}