package hackerRank.algorithms

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var counter = 0

    for (i in 0..s.size - m) {
        var tmp = 0
        var sum = 0

        while (tmp < m) {
            sum += s[i + tmp]
            tmp++
        }

        if (sum == d)
            counter++
    }

    return counter
}
