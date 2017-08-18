package com.mohammad.kotlin.learning.basics

/**
 * Created by mohammadmoradyar on 6/26/17.
 */
fun main(args: Array<String>) {

    for (a in 1..100)
        println(a)

    space()

    val range = 1..100
    for (a in range)
        println(a)

    space()

    for (a in 100 downTo 1)
        println(a)

    space()

    // Does not print anything
    for (a in 100..1)
        println(a)

    space()

    for (b in 100 downTo 1 step 5)
        println(b)

    space()

    val capitals = listOf("Berlin", "Tehran", "Rome", "London")
    for (capital in capitals)
        println(capital)

    space()

    var i = 100
    while (i > 0) {
        println(i)
        i--
    }

    space()

    do {
        i++
        println(i)
    } while (i < 100)

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@loop
            }
        }
    }

}

fun space() {
    println("\n\n\n\n\n\n\n\n")
}