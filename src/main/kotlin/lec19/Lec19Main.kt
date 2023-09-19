package lec19

data class DataPerson(
    val name: String,
    val age: Int
)

class Person(
    val name: String,
    val age: Int
) {

    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}


fun main() {
    val person = Person("crispin", 100)
    val (name, age) = person
    println("이름: $name, 나이: $age")

    val dataPerson = DataPerson("crispin", 100)
    val (name2, age2) = dataPerson
    println("이름: $name2, 나이: $age2")

    val numbers = listOf(1, 2, 3)

    for (number in numbers) {
        if (number == 2) {
            break
        }
    }

    run {
        numbers.map { number -> number + 1 }
            .forEach { number ->
                if (number == 2) {
                    return@run
                }
            }
    }

    run {
        numbers.map { number -> number + 1 }
            .forEach { number ->
                if (number == 2) {
                    return@forEach
                }
            }
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            print("$i, $j")
        }
    }
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}