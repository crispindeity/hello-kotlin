package lec15

fun main() {
    val array = arrayOf(100, 200)

    for (index: Int in array.indices) {
        println("$index ${array[index]}")
    }

    for ((index, value) in array.withIndex()) {
        println("$index $value")
    }

    val plusArray = array.plus(300)

    for ((index, value) in plusArray.withIndex()) {
        println("$index $value")
    }

    val numbers: List<Int> = listOf(100, 200)
    val emptyList: List<Int> = emptyList()
    val mutableNumbers: MutableList<Int> = mutableListOf(100, 200)
    printNumbers(numbers)
    printNumbers(emptyList)
    mutableNumbers.add(300)
    printNumbers(mutableNumbers)
}

private fun printNumbers(numbers: List<Int>) {
    if (numbers.isNotEmpty()) println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((index, value) in numbers.withIndex()) {
        println("$index $value")
    }
}