package hackerRank.algorithms

fun migratoryBirds(arr: Array<Int>): Int {
    var max = Int.MIN_VALUE

    for (element in arr)
        if (element > max)
            max = element

    val resultArray = Array(max + 1) { 0 }

    for (i in arr.indices)
        resultArray[arr[i]]++

    max = Int.MIN_VALUE
    var resultIndex = -1

    for (i in resultArray.indices)
        if (resultArray[i] > max) {
            max = resultArray[i]
            resultIndex = i
        }

    return resultIndex
}
