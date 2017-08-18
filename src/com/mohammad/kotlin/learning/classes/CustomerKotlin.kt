package com.mohammad.kotlin.learning.classes

import java.io.IOException

/**
 * Created by mohammadmoradyar on 6/27/17.
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    @JvmField val someField = "Value"
    var status: Status = Status.CURRENT

    @JvmOverloads fun chageStatus(status: Status = Status.CURRENT) {
        this.status = status
    }

    override fun toString(): String {
        //language=JSON
        return "{\"id\" : \"$id\" , \"name\" : \"$name\" , \"email\" : \"$email\"}"
    }

    @JvmName("prefferntial") fun makePreffered() {

    }

    @Throws(IOException::class) fun loadStatistics(fileName: String) {
        if (fileName == "") throw IOException()
    }
}

fun CustomerKotlin.extension() {
    println("Extension")
}

enum class Status(value: Int) {
    CURRENT(0),
    PAST(1)
}

fun main(args: Array<String>) {
    var customer1 = CustomerKotlin(0, "mohammad", "mohammad@gmail.com")
    var customer2 = CustomerKotlin(0, "mohammad", "mohammad@gmail.com")
    var customer3 = CustomerKotlin(1, "mohammad", "mohammad@gmail.com")

    if (customer1 == customer2)
        println("1 and 2 are the same")
    else
        println("1 and 2 are not the same")

    if (customer2 == customer3)
        println("2 and 3 are the same")
    else
        println("2 and 3 are not the same")

    println(customer1)
}