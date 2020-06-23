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

class Box {
    var content: Any? = null
    fun put(content: Any?) {
        this.content = content
    }

    fun retrieve(): Any? {
        return content
    }

    fun isEmpty(): Boolean {
        return content == null
    }
}