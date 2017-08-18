package com.mohammad.kotlin.learning.functions

/**
 * Created by mohammadmoradyar on 6/26/17.
 */
fun hello(): Unit {
    println("Hello")
}

fun throwingException(): Nothing {
    throw Exception("This is an exception that thrown")
}

fun takingName(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String) {
    reallyPrintStrings(*strings)
}

private fun reallyPrintStrings(vararg strings: String) {
    for (string in strings)
        println(string)
}

fun main(args: Array<String>) {
    hello()

    try {
        throwingException()
    } catch(e: Exception) {
    }

    takingName("Mohammad")

    println(sum(2, 3))

    println(sum(2, 3, 4))

    println(sum(2, 3, w = 4))

    printDetails("Mohammad Moradyar", phone = "09129458021")

    printDetails("Mohammad Moradyar", phone = "09129458021", email = "moradyar@gmail.com")

    printStrings("yadi", "madi", "sadi", "jadi")

    printStrings("yadi", "madi", "sadi")
}