package algorithms

fun main(args: Array<String>) {
    val numbArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val result = simpleArraySum(numbArray)
    println(result)
}

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    ar.forEach { i -> sum += i }
    return sum
}