package algorithms


fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var result = 0L
    ar.forEach { i -> result += i }
    return result
}
