package twoday

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        print("예외")
    } finally {
        println("finally")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생 !")
    }
    println(a)

//    throw Exception("예외 발생")

//    val b: String? = null
//    val c: String = b ?: failFast("b is null")
//
//    print(c.length)

    failFast("b is null")
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}