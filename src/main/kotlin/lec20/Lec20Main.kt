package lec20

import lec09.Person

fun main() {
    val person = Person()

    val value1: Int = person.let {
        it.age
    }

    val value2: Int = person.run {
        this.age
    }

    val value3: Person = person.also {
        it.age
    }

    val value4: Person = person.apply {
        this.age
    }

    val value5 = Person("crispin", 100)
    with(person) {
        println(name)
        println(this.age)
    }

    val strings = listOf("APPLE", "CAR")
    strings.map { string -> string.length }
        .filter { length -> length > 3 }
        .let(::println)

    val numbers = listOf("one", "tow", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)
}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun getLength(str: String?): Int? {
    return str?.let {
        println(it.uppercase())
        it.length
    }
}