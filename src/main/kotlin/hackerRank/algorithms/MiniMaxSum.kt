package hackerRank.algorithms

/*
* Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):
arr: an array of  integers
Print
Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format
A single line of five space-separated integers.

Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated
by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

* */
fun miniMaxSum(arr: Array<Int>) {
    var sum = 0L
    var max = 0L
    var min = Long.MAX_VALUE

    for (i in arr.indices) {
        if (arr[i] < 0)
            continue
        sum += arr[i]
        if (arr[i] > max)
            max = arr[i].toLong()
        if (arr[i] < min)
            min = arr[i].toLong()
    }

    println("${sum - max} ${sum - min}")
}
