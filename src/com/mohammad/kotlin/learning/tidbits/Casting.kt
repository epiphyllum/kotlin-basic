package com.mohammad.kotlin.learning.tidbits

/**
 * Created by mohammadmoradyar on 6/27/17.
 */
open class Person

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days > 80)
            println("Yes , you'r lucky.")
    }
}

class Contractor : Person()

fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(120)
    }
}

var input : Any = 10

fun main(args: Array<String>) {

    var str  = input as? String
    println(str?.length)

}