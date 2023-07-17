package threeday

import java.util.HashSet

//class Person(val name: String, val age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        if (name != other.name) return false
//        return age == other.age
//    }
//
//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }
//}

data class Person(val name: String, val age: Int)

fun main() {
    // Equals: 동등성 비교
    val person = Person(name = "Tony", age = 12)
    val person2 = Person(name = "Tony", age = 12)

    println(person == person2)

    val set: HashSet<Person> = hashSetOf(person)
    println(set.contains(person))

    println(person)
    val person3 = person.copy(name = "strange")
    println(person3)

    println("이름=${person.component1()}, 나이=${person.component2()}")

    // 구조 분해 할당
    val (name, age) = person
    println("이름=${name}, 나이=${age}")
}