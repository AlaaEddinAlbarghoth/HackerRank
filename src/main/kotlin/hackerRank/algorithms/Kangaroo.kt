package hackerRank.algorithms

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String =
    if (x1 < x2 && v1 < v2)
        "NO"
    else
        if (v1 != v2 && (x2 - x1) % (v2 - v1) == 0)
            "YES"
        else
            "NO"