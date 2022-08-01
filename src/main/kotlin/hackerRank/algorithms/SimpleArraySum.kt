package hackerRank.algorithms

/*
* Function Description

    Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

    simpleArraySum has the following parameter(s):

    ar: an array of integers
    Input Format

    The first line contains an integer n denoting the size of the array.
    The second line contains  space-separated integers representing the array's elements.
* */
fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (element in ar)
        sum += element
    return sum
}
