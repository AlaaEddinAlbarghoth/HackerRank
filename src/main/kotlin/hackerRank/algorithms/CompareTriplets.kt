package hackerRank.algorithms

/*
* Function Description

    Complete the function compareTriplets in the editor below.

    compareTriplets has the following parameter(s):

    int a[3]: Alice's challenge rating
    int b[3]: Bob's challenge rating
    Return

    int[2]: Alice's score is in the first position, and Bob's score is in the second.
    Input Format

    The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
    The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.
* */
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var bobRating = 0
    var aliceRating = 0

    for (i in a.indices)
        if (a[i] > b[i])
            aliceRating++
        else if (a[i] < b[i])
            bobRating++

    return arrayOf(aliceRating, bobRating)
}
