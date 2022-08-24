package hackerRank.algorithms

fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    val charges = (bill.sum() - bill[k]) / 2

    if (charges == b)
        println("Bon Appetit")
    else
        println(b - charges)
}
