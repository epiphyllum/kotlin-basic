@file:JvmName("UtilityClass")

package com.mohammad.kotlin.learning.interop

/**
 * Created by mohammadmoradyar on 6/30/17.
 */

const val copyrightYear = 2016

fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}