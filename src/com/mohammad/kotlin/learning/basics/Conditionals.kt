package com.mohammad.kotlin.learning.basics

import com.mohammad.kotlin.learning.basics.utils.add

/**
 * Created by mohammadmoradyar on 6/26/17.
 */
fun main(args: Array<String>) {
    var myString = ""

    val result = if (myString != "") {
        "Not empty"
        20
    } else {
        "Empty"
    }

    val whenValue = when (result) {
        is String -> {
            println("It's a string.")
            println("ERFr3")
            "Returning from first case in when"
        }
        "value" -> {
            println("It's a value.")
            "Returning from second case in when"
        }
        else -> {
            println("Else")
            "Returning from third case in when"
        }
    }

    println(whenValue)

    add(4, 5)
}