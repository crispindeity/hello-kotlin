package lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
    val person = Person("A", "B", 100)
    println(person.nextYearAge())
    val number = 1234
    println(number.add(3))
    println(number add2 3)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}