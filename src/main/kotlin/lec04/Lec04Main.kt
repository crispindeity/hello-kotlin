package lec04

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)
    val money3 = money1
    val money4 = JavaMoney(2000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }
    println(money1 === money3)
    println(money1 == money4)

    // Lazy 연산
    if (fun1() || fun2()) {
        println("본문")
    }

    val money5 = Money(1000L)
    val money6 = Money(2000L)
    println(money5.plus(money6))
    println(money5 + money6)
}


fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return true
}