package threeday

import java.time.LocalDateTime

object Singleton {
    private const val a = 1234

    fun printA() = println(a)
}

object DatetimeUtils {
    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}

class MyClass private constructor() {

    companion object MyCompanion {
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main() {
    println(Singleton.printA())
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)

    println(DatetimeUtils.DEFAULT_FORMAT)
    val now: LocalDateTime = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))

    println(MyClass.a)
    println(MyClass.newInstance())
    println(MyClass.MyCompanion.newInstance())
}
