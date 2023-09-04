package lec02

fun main() {

    val str: String? = "ABC"
    println(str?.length)
    println(str?.length ?: 0)
    println(startsWithA1(str))
    println(startsWithA2(str))
    println(startsWithA3(str))
    println(startsWithA4(str))

    val person: Person = Person("Crispin")
    startsWithA5(person.name)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithA5(str: String): Boolean {
    return str.startsWith("A")
}