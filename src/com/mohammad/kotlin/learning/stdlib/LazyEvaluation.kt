package com.mohammad.kotlin.learning.stdlib

/**
 * Created by mohammadmoradyar on 7/2/17.
 */
fun main(args: Array<String>) {
    val elements = 1..100000000000

    val sumOfFirstThirty = elements.asSequence().take(30).sum()
    println(sumOfFirstThirty)

    val numbers = generateSequence(0) {
        x ->
        println("It is x : $x + 10 = ${x + 10}")
        x + 10
    }
    println(numbers.take(3).sum())

//    val outPut = elements.asSequence().filter { it < 30 }.map { Pair("Yes" , it) }
//    outPut.forEach { println(it) }

    val lazyInt: Int by lazy { 10 }


}