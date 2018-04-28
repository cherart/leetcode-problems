package cherart.easy

/*
231. Power of Two

Given an integer, write a function to determine if it is a power of two.
*/

fun isPowerOfTwo(n: Int): Boolean =
        when {
            n < 0 -> false
            n == 0 -> false
            n == 1 -> true
            n == 2 -> true
            else -> divideTwo(n)
        }

fun divideTwo(n: Int): Boolean {
    var m = n
    val isTwo: Boolean
    while (true) {
        if (m % 2 == 1 && m != 1) {
            isTwo = false
            break
        } else if (m == 1){
            isTwo = true
            break
        }
        m /= 2
    }
    return isTwo
}

