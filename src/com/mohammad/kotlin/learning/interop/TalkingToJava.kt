package com.mohammad.kotlin.learning.interop

import com.mohammad.kotlin.learning.classes.CustomerJava

/**
 * Created by mohammadmoradyar on 6/30/17.
 */
fun main(args: Array<String>) {
    val customerJava = CustomerJava(0, "Mohammad", "mohammad@email.com")
    customerJava.name = "Ali"
    customerJava.prettyPrint()

    RunnableTest().runnableRunner {
        println("Yes do it")
    }
}

class PersonKotlin : PersonJava()

class CustomerRepoKotlinImpl : CustomerRepoJava {
    override fun a() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun b() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}