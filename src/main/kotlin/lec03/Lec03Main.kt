package lec03

import lec02.Person

fun main() {
    val person = Person("crispin", 23)
    printAgeIfPerson(person)
    printAgeIfPerson(null)
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    val log = "이 사람의 이름은 ${person?.name ?: "haha"} 이고 나이는 ${person?.age ?: 19} 입니다."
    println(log)
}