package cherart.easy

import kotlin.math.absoluteValue

/*
504. Base 7

Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"

Example 2:
Input: -7
Output: "-10"

Note: The input will be in range of [-1e7, 1e7].
*/

fun convertToBase7(num: Int): String {
    val result = StringBuilder()
    var divide = Math.abs(num)
    var rest: Int
    while (divide != 0) {
        rest = divide % 7
        divide /= 7
        result.insert(0, rest)
    }
    if (num < 0)
        result.insert(0, "-")
    return if (num == 0) "0" else result.toString()
}
