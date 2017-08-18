package com.mohammad.kotlin.learning.tidbits

import com.mohammad.kotlin.learning.classes.CustomerKotlin

/**
 * Created by mohammadmoradyar on 6/27/17.
 */

fun capitalAndPopulation(): Pair<String, Long> {
    return Pair("Tehran", 10000000)
}

fun countryInfo(): Triple<String, String, Long> {
    return Triple("Iran", "Tehran", 70000000)
}

fun main(args: Array<String>) {

    val tehranInfo = capitalAndPopulation()
    println(tehranInfo)

    val iranInfo = countryInfo()
    println(iranInfo)

    val (country, city, population) = countryInfo()
    println(country)
    println(city)
    println(population)

    val (id, name, email) = CustomerKotlin(10, "Mohammad", "email")
    println(id)
    println(name)
    println(email)


    val listOfCapitalsAndCountries = listOf(Pair("Tehran", "Iran"), "Baqdad" to "Iraq")
    for ((capital, country) in listOfCapitalsAndCountries) {
        println("Capital is $capital and country is $country")
    }
}