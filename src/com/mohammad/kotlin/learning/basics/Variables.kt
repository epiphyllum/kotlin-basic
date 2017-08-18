package com.mohammad.kotlin.learning.basics

/**
 * Created by mohammadmoradyar on 6/26/17.
 */

fun main(args: Array<String>) {
    var streetNumber: Int
    var streetName = "High street"
    val zip = "E11 P1"

    streetName += " Mohammad moradyar";

    var myLong = 100L
    var myInt = 10
    var myByte: Byte
    var myBoolean = true
    var mayLongAgain: Long = myInt.toLong()
    var myChar = 'A'
    var myEscapedString = "Mohammad \nMoradyar"
    var rawString = "ali " + "naghi"
    var multiLineString = """ Yes
        now every text i want can write in my text
        eve in another line
        """
    var years = 10
    var interpolation = "A decade is $years years."
    println(interpolation)

    val name = "Mohammad"
    val lenghtOfName = "Lenght of name is ${name.length}"
    println(lenghtOfName)

}