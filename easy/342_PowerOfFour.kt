package easy

/*
342. Power of Four

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
*/

fun isPowerOfFour(num: Int): Boolean {
    var i = 0
    var result = 0
    while (result < num) {
        result = Math.pow(4.toDouble(), i.toDouble()).toInt()
        i++
    }
    return result == num
}