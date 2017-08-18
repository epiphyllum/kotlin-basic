package com.mohammad.kotlin.learning.tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by mohammadmoradyar on 6/28/17.
 */
class NotANumberException(message: String) : Throwable(message)

fun isNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Double, Float -> throw NotANumberException("This is not a number :(")
    }
}

fun main(args: Array<String>) {

    try {
        isNumber("A")
    } catch(e: NotANumberException) {
        println("It's not a number : ${e.message}")
    }

    var buffer = BufferedReader(FileReader("readMe.txt"))
    val result = try {
        var chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled : ${e.message}")
    } finally {
        println("Closing")
        buffer.close()
    }
    println(result)
}