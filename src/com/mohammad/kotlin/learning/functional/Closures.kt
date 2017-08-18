package com.mohammad.kotlin.learning.functional

/**
 * Created by mohammadmoradyar on 6/30/17.
 */

fun outSideFunction() {
    val number = 10
    println(unaryOperation(5) {
        x ->
        x * number
    })
    for (number in 1..30) {
        println(unaryOperation(20, {
            x ->
            println(number)
            x * number
        }))
    }
}

fun main(args: Array<String>) {
    outSideFunction()
}