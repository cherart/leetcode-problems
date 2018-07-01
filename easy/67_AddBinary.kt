package easy

/*
67. Add Binary

Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

fun addBinary(a: String, b: String): String {
    val result = StringBuilder()
    val A: StringBuilder = StringBuilder(a.reversed())
    val B: StringBuilder = StringBuilder(b.reversed())

    if (a.length > b.length) {
        addZeroes(a.length - b.length, B)
    } else if (b.length > a.length) {
        addZeroes(b.length - a.length, A)
    }

    var sum = 0
    var carry = 0
    for (i in 0 until if (a.length > b.length) a.length else b.length) {
        sum = Character.getNumericValue(A[i]) + Character.getNumericValue(B[i]) + carry
        when (sum) {
            0 -> {
                result.append("0")
                carry = 0
            }
            1 -> {
                result.append("1")
                carry = 0
            }
            2 -> {
                result.append("0")
                carry = 1
            }
            3 -> {
                result.append("1")
                carry = 1
            }
        }
    }

    if (carry == 1)
        result.append("1")

    return result.toString().reversed()
}

fun addZeroes(count: Int, str: StringBuilder) {
    for (i in 0 until count) {
        str.append("0")
    }
}