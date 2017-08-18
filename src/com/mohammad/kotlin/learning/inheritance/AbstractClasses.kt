package com.mohammad.kotlin.learning.inheritance

/**
 * Created by mohammadmoradyar on 6/28/17.
 */
abstract class StoredEntity {
    abstract fun store()
    val isActive = true
    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {

    override fun store() {

    }

}

fun main(args: Array<String>) {
    var se = Employee()
    println(se.status())
}