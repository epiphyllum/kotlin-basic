package com.mohammad.kotlin.learning.classes

/**
 * Created by mohammadmoradyar on 6/27/17.
 */
enum class Priority(val value: Int) {
    MINOR(1){
        override fun text(): String {
            return "MINOR PRIORITY"
        }

        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(2) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(3) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(4) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text() : String
}

fun main(args: Array<String>) {
    var priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(priority.name)
    println(priority.ordinal)

    for (priorityInList in Priority.values())
        println(priorityInList)

    val p = Priority.valueOf("MINOR")
    println(p)
    println(p.text())
    Global.setToken("wfrgr")
}