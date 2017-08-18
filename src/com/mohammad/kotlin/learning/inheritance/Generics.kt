package com.mohammad.kotlin.learning.inheritance

/**
 * Created by mohammadmoradyar on 6/30/17.
 */
interface Repository<T> {
    fun store(t: T)
    fun getById(id: Long): T
    fun getAll(): List<T>
}

interface Repo {
    fun <T> store(t: T)
    fun <T> delete(t: T)
    fun <T> getById(id: Long): T
    fun <T> getAll(): List<T>
}

class RepositoryImpl<T> : Repository<T> {
    override fun store(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Long): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class A(val a: String = "")

data class B(val b: String = "")

class MyRepo : Repo {
    override fun <T> delete(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> store(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getById(id: Long): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    val customerRepo = RepositoryImpl<Customer>()
    customerRepo.store(Customer(10, "Mohammad"))
    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()

    val myRepo = MyRepo()
    myRepo.store(A())
    myRepo.delete(B())
}