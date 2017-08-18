package com.mohammad.kotlin.learning.inheritance

/**
 * Created by mohammadmoradyar on 6/28/17.
 */
open class Person {
    open fun validate() {

    }

}

open class Customer(var id: Int = 0, var name: String = "") : Person() {

    override fun validate() {

    }
}

class SpecialCustomer : Customer() {
    override fun validate() {
        super.validate()
    }
}

data class CustomerEntity(var name: String) : Person()

fun main(args: Array<String>) {

}