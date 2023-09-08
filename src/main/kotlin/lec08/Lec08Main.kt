package lec08

fun main() {
    repeat(str = "Hello World")
    repeat(str = "Hello World", useNewLine = false)
    printNameAndGender(name = "Crispin", genger = "FEMALE")
    printAll("A", "B", "C")
    val array: Array<String> = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, genger: String) {
    println(name)
    println(genger)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}