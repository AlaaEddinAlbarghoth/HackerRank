package hackerRank.algorithms

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var counter = 0

    a.sort()
    b.sort()

    for (index in a[a.size - 1]..b[0]) {
        var isFactoryMultiple = true

        for (element in a)
            if (index % element != 0) {
                isFactoryMultiple = false
                break
            }
        for (element in b)
            if (element % index != 0) {
                isFactoryMultiple = false
                break
            }

        if (isFactoryMultiple)
            counter++
    }

    return counter
}
