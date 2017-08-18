package com.mohammad.kotlin.learning.functional

/**
 * Created by mohammadmoradyar on 6/30/17.
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

fun operation(x: Int, op: (Int) -> Unit) {
    op(x)
    println("Done")
}

fun operation(x: String, y: String, op: (String, String) -> String): String {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun sub(x: Int, y: Int) = if (x > y) x - y else y - x

fun apply(x: Int) {
    println("This is X : $x")
}

fun concat(x: String, y: String): String {
    return x + " " + y
}

fun unaryOperation(x: Int, op: (Int) -> Int) {
    println(op(x))
}

fun unaryOperation(op: (Int) -> Int) {
    println(op(88))
}

fun transaction(db: DataBase, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

fun transaction(db: DataBase, x: Int, code: (x: Int) -> Int) {
    try {
        code(x)
    } finally {
        db.commit()
    }
}

class DataBase {
    fun commit() {
        println("Committed on db")
    }
}

fun main(args: Array<String>) {
    operation(1, 2, ::sum)
    operation(1, 2, ::sub)
    operation(5, ::apply)
    println(operation("Mohammad", "Moradyar", ::concat))
    val sumLamda: (Int, Int) -> Int = { x, y -> x + y }
    operation(5, 6, sumLamda)

    // Magic code -> these are the same
    unaryOperation(5, { x -> x * x })

    unaryOperation(5, { it * it })

    unaryOperation(5) { it * it }

    unaryOperation { it * it }

    // Real magic is here
    val db = DataBase()
    transaction(db) {
        // Implement some code it's magic
    }

    transaction(db, 5) {
        // Will return 25
        it * it
    }
}