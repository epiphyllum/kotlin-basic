package com.mohammad.kotlin.learning.functional

/**
 * Created by mohammadmoradyar on 6/30/17.
 */
fun String.hello() {
    println("It's me , $this")
}

fun ArrayList<String>.hello() {
    this.forEach { println("Hello $it") }
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}

fun main(args: Array<String>) {
    "".hello()
    var str = "Anahid"
    str.hello()

    val strings = ArrayList<String>()
    (1..100).mapTo(strings) { it.toString() }
    strings.hello()

    val title = "This is a sample of title string"
    println(title.toTitleCase("Mohammad - "))

    val instance : BaseClass = InheritedClass()
    instance.extenstion()

    val instance2 = InheritedClass()
    instance2.extension()
}

open class BaseClass

class InheritedClass : BaseClass()

fun BaseClass.extenstion() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}