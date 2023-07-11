package firstday

fun main() {

    // 범위 연산자 .. 를 사용해 for loop 돌리기
    for (i in 0..3) {
        println(i)
    }

    // until 을 사용하면 뒤에온 숫자는 포함하지 않는다.
    for (i in 0 until 3) {
        println(i)
    }

    // step 에 들어온 값 만큼 증가시킨다.
    for (i in 0..6 step 2) {
        println(i)
    }

    // downTo를 사용해 반복하면서 값을 감소시킨다.
    for (i in 3 downTo 1) {
        println(i)
    }

    // 전달 받은 배열을 반복
    val numbers: Array<Int> = arrayOf(1, 2, 3)

    for (i in numbers) {
        println(i)
    }

    // 자바의 while문 과 동일
    var x: Int = 5

    while (x > 0) {
        println(x)
        x--
    }
}