package com.example.a000_algorithms

class Algorithms {

    fun hola() {
        print("Hola Mundo")
    }
}

fun main (args: Array<String>) {

    val obj = Algorithms()
    obj.hola()

    val box = Box<Int>()
    box.put(4)
    val boolBox = Box<Boolean>()
    boolBox.put(true)

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