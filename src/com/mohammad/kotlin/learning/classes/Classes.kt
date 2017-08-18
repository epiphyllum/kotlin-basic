package com.mohammad.kotlin.learning.classes

import java.util.*
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * Created by mohammadmoradyar on 6/27/17.
 */
class Customer(var id: Int, var name: String = "", val yearOfBirth: Int = 1900, sex: Int) {
    init {
        if (name.length > 0)
            name = name.toUpperCase()
    }

    val age: Int get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
    var sex: Int = sex
        set(value) {
            field = value + 10
        }

    fun customerAsString() {
        println("Id: $id , Name: $name , Age: $age , Sex: $sex")
    }
}

fun main(args: Array<String>) {
    var customer = Customer(10, "Mohammad", 1988, 0)
    customer.sex = 10
    println(customer.name + " " + customer.age + " " + customer.sex)
    customer.customerAsString()
}