package lec09

fun main() {
    val person = Person("crispin", 10)
    println(person.name)
    person.age = 11
    println(person.age)

    val namePerson = Person("crispin")
    println(namePerson.age)

    val javaPerson = JavaPerson("crispin", 10)
    println(javaPerson.name)
    javaPerson.age = 11
    println(javaPerson.age)
}

class Person(
    val name: String = "crispin",
    var age: Int = 1
) {
    init {
        check(age > 0) {throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")}
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20

//    val name: String = name
//        get() = field.uppercase()

    fun getUpperacseName(): String = this.name.uppercase()

    val uppercaseName: String
        get() = this.name.uppercase()

//    var name = name
//        set(value) {
//            field = value.uppercase()
//        }
}