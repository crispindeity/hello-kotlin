package firstday

fun main() {
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    val age : Int = 10
    val str = if (age > 10) {
        "성인"
    } else {
        "아니"
    }

    val a = 1
    val b = 2
    val c = if (b > a) b else a

    val day = 2
    val result: String = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }
    println(result)

    when(getColor()) {
        Color.RED -> println("rad")
        Color.GREEN -> println("green")
    }

    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1이 아님")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor(): Color = Color.RED

fun getNumber(): Int = 2