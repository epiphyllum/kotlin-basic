package com.mohammad.kotlin.learning.stdlib

/**
 * Created by mohammadmoradyar on 6/30/17.
 */
fun main(args: Array<String>) {
    val numbers = 1..100

    // Imutable lists
    var cities = listOf("Madrid" , "Paris" , "London")
    var emptyList = emptyList<String>()


    println(cities.javaClass)
    println(emptyList.javaClass)

    // Mutable lists
    val mutableCities = mutableListOf("Madrid")
    val hashMap = hashMapOf(Pair("tehran" , "iran") , Pair("madrid" , "spain"))

}