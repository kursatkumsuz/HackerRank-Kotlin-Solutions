package algorithms


fun main(args: Array<String>) {

    val a = arrayOf(5,6,7)

    val b = arrayOf(3,6,10)

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aliceScore = 0
    var bobScore = 0
    if(a[0] > b[0]) aliceScore+=1
    if(a[0] < b[0]) bobScore+=1
    if(a[1] > b[1]) aliceScore+=1
    if(a[1] < b[1]) bobScore+=1
    if(a[2] < b[2]) bobScore +=1
    if(a[2] > b[2]) aliceScore +=1

    return arrayOf(aliceScore , bobScore)
}


