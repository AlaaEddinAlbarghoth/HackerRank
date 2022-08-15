package hackerRank.algorithms

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var msp = 0
    var lsp = 0

    var min = scores[0]
    var max = scores[0]

    for (i in 1 until scores.size) {
        if (scores[i] > max) {
            max = scores[i]
            msp++
        }
        if (min > scores[i]) {
            min = scores[i]
            lsp++
        }
    }

    return arrayOf(msp, lsp)
}
