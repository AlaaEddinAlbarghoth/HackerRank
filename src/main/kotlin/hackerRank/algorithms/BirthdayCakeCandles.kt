package hackerRank.algorithms

/*
* https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
* Example : [3 2 1 3], Result => 2
* */
fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = 0L
    var counter = 0

    for (candle in candles) {
        if (candle > max) {
            counter = 0
            max = candle.toLong()
        }
        if (candle.toLong() == max)
            counter++
    }

    return counter
}
