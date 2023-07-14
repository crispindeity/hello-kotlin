package threeday

import java.util.*

fun main() {
    val currencyList: List<String> = listOf("달러", "유로", "원")

    val mutableCurrencyList: MutableList<String> = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    val numberSet: Set<Int> = setOf(1, 2, 3)

    val mutableSet: MutableSet<Int> = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    val numberMap: Map<String, Int> = mapOf("one" to 1, "two" to 2)

    val mutableNumberMap: MutableMap<String, Int> = mutableMapOf()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    val linkedList: LinkedList<Int> = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    val arrayList: ArrayList<Int> = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator: Iterator<String> = currencyList.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }

    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach {
        println(it)
    }

    val lowerList: List<String> = listOf("a", "b", "c")
//    val upperList: MutableList<String> = mutableListOf()
//
//    for (lowerCase in lowerList) {
//        upperList.add(lowerCase.uppercase())
//    }

    val upperList: List<String> = lowerList.map { it.uppercase() }
    println(upperList)
    val filterList: List<String> = upperList.filter { it == "A" || it == "C" }
    println(filterList)
}