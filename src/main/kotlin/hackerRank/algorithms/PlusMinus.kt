package hackerRank.algorithms

/*
* Function Description

    Complete the plusMinus function in the editor below.

    plusMinus has the following parameter(s):
    int arr[n]: an array of integers
    Print
    Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

    Input Format
    The first line contains an integer, , the size of the array.
    The second line contains  space-separated integers that describe .

    Output Format
    Print the following  lines, each to  decimals:
    proportion of positive values
    proportion of negative values
    proportion of zeros
* */
fun plusMinus(arr: Array<Int>) {
    var numOfZeros = 0
    var numOfPositive = 0
    var numOfNegative = 0

    for (element in arr)
        when {
            element > 0 -> numOfPositive++
            element < 0 -> numOfNegative++
            else -> numOfZeros++
        }

    println(numOfPositive.toFloat() / arr.size)
    println(numOfNegative.toFloat() / arr.size)
    println(numOfZeros.toFloat() / arr.size)
}
