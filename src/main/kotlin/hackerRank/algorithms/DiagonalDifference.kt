package hackerRank.algorithms

import kotlin.math.abs

/*
* Function description

    Complete the  function in the editor below.

    diagonalDifference takes the following parameter:
    int arr[n][m]: an array of integers

    * Return
    int: the absolute diagonal difference

    * Input Format
    The first line contains a single integer, n, the number of rows and columns in the square matrix .
    Each of the next n lines describes a row, arr[i], and consists of n space-separated integers .

    Constraints

    * Output Format
    Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
* */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonals = 0
    var rightDiagonals = 0

    for (i in arr.indices) {
        leftDiagonals += arr[i][i]
        println("leftDiagonals $leftDiagonals")
        rightDiagonals += arr[i][arr.size - 1 - i]
        println("rightDiagonals $rightDiagonals")
    }

    return abs(leftDiagonals - rightDiagonals)
}