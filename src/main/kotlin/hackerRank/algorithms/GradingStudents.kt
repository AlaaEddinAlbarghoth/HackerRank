package hackerRank.algorithms

/*
* https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
* */
fun gradingStudents(grades: Array<Int>): Array<Int> {

    val result = Array(grades.size) { 0 }

    for (i in grades.indices)
        if (grades[i] > 37) {
            val mode = grades[i] % 5
            if (mode >= 3)
                result[i] = grades[i] + (5 - mode)
            else
                result[i] = grades[i]
        } else
            result[i] = grades[i]

    return result
}