package com.mohammad.kotlin.learning.nulls

/**
 * Created by mohammadmoradyar on 6/27/17.
 */

class Service {
    fun evalute() {
        println("Evaluating")
    }
}

class ServiceProvider {
    fun createService(): Service? {
        return Service()
    }
}

class Toaster {
    fun showToast() {
        println("Toast")
    }
}

class FinalToaster {
    fun showToast() {
        println("Toast")
    }
}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()

fun main(args: Array<String>) {
    val message: String = "Message"
    val nullMessage: String? = null
    var inferredNull = null
    val toaster: Toaster? = Toaster()
    val finalToaster: FinalToaster = FinalToaster()

    println(nullMessage?.length)
    val sp = createServiceProvider()
    sp?.createService() ?: toaster?.showToast() ?: finalToaster.showToast()
    createServiceProvider()?.createService()?.evalute()
}