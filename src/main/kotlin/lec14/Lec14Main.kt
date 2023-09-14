package lec14

fun main() {
    val personDto = PersonDto("Crispin", 100)
    val personDto1 = PersonDto("Crispin", 200)

    println(personDto == personDto1)
    println(personDto)
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}