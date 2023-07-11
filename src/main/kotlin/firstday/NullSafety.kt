package firstday

fun main() {

    // null 할당 불가    
//    val a: String = null
//    var b: String = "asdkjasd"
//    b = null

    // null 할당 가능
    var a: String? = null
    println(a?.length)

    val b: Int = if (a != null) a.length else 0
    println(b)

    // 일비스 연산자
    val c = a?.length ?: 0
    println(c)

    val nullableStr: String? = getNullStr()
    val nullableStrLength = nullableStr?.length ?: 0

    val length: Int = getLengthIfNotNull(null)
    println(length)

//    val d: String? = null
//    val e = d!!.length
}

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: "null인 경우 반환".length