package hackerRank.algorithms

/*
* Function Description

    Complete the staircase function in the editor below.

    staircase has the following parameter(s):
    int n: an integer
    Print
    Print a staircase as described above.

    Input Format
    A single integer, n, denoting the size of the staircase.

    Output Format
    Print a staircase of size  using # symbols and spaces.
    Note: The last line must have  spaces in it.
* */
fun staircase(n: Int) {
    for (i in 1..n) {
        for (j in 1..n)
            when {
                n - i - j < 0 -> print("#")
                else -> print(" ")
            }
        println()
    }
}
