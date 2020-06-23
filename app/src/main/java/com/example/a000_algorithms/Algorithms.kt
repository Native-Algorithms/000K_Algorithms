package com.example.a000_algorithms

class Algorithms {

    fun hola() {
        print("Hola Mundo")
    }
}

fun main (args: Array<String>) {

    val obj = Algorithms()
    obj.hola()

}

class Box<T> {
    var content: T? = null
    fun put(content: T?) {
        this.content = content
    }
    fun retrieve(): T? {
        return content
    }
    fun isEmpty(): Boolean {
        return content == null
    }
}