package com.mohammad.kotlin.learning.inheritance

/**
 * Created by mohammadmoradyar on 6/28/17.
 */
interface CustomerRepository {

    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // Implement some code
    }

    fun getById(id: Int): Customer
}

class SQLCustomerRepository : CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA() {
        println("Fun A from interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from interface 2")
    }
}

class Class1And2 : Interface1, Interface2 {
    override fun funA() {
        super<Interface1>.funA()
        super<Interface2>.funA()
        println("Our own")
    }
}

fun main(args: Array<String>) {
    Class1And2().funA()
}