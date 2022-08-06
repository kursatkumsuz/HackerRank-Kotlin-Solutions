package strings


fun main(args: Array<String>) {
    val s = readLine()!!

    val result = camelcase(s)

    println(result)
}

fun camelcase(s: String): Int {
    val result = s.toCharArray().filter {it.isUpperCase()}.size + 1
    return result

}