package lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("움직인다~~~!")
        }

        override fun fly() {
            println("난다~~~!")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE )
        }

        override fun Log() {
            println("나는 Person 클래스의 동행 객체에요")
        }
    }
}

object Singleton {
    var a : Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}