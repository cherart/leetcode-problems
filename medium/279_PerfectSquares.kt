package medium

var min = Int.MAX_VALUE
var counter = 0

fun numSquares(n: Int): Int {
    if(n == 1) {
        return 1
    } else if (n == 2){
        return 2
    } else if(n == 3) {
        return 3
    } else {
        recursion(n)
        return min
    }
}

fun recursion(n: Int) {
    if (n > 0 && counter < 4) {
        for (i in 0 until Math.sqrt(n.toDouble()).toInt()) {
            var sqrt = Math.sqrt(n.toDouble()).toInt() - i
            counter++
            recursion(n - sqrt * sqrt)
        }
    } else if (n == 0) {
        if (counter < min)
            min = counter
    }
    counter--
}

