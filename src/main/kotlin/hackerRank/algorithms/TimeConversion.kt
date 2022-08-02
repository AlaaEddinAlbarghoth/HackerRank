package hackerRank.algorithms

/*
* https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
* */
fun timeConversion(s: String): String {
    val time12Format = s.substring(0, s.length - 2)
    val interval = s.substring(s.length - 2, s.length).lowercase()


    val hour = time12Format.substring(0, 2).toInt()
    return when {
        interval == "pm" -> (12 + hour % 12).toString() + s.substring(2, s.length - 2)
        hour == 12 -> "00" + s.substring(2, s.length - 2)
        else -> time12Format
    }
}
