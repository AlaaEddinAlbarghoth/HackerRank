package hackerRank.algorithms

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var counter = 0

    for (i in 0 until n)
        for (j in i + 1 until n)
            if ((ar[i] + ar[j]) % k == 0)
                counter++
    return counter
}