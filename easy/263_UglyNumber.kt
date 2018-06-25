package easy

/*
263. Ugly Number

Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

Example 1:

Input: 6
Output: true
Explanation: 6 = 2 × 3

Example 2:

Input: 8
Output: true
Explanation: 8 = 2 × 2 × 2

Example 3:

Input: 14
Output: false
Explanation: 14 is not ugly since it includes another prime factor 7.

Note:

1 is typically treated as an ugly number.
Input is within the 32-bit signed integer range: [−231,  231 − 1].
*/

fun isUgly(num: Int): Boolean {
    val primes = intArrayOf(2,3,5)
    if (num == 1 || num == 2 || num == 3 || num == 5)
        return true
    if (num <= 0)
        return false
    var number = num
    for (i in primes) {
        while (number % i == 0) {
            if (number / i == 1 && number % i == 0)
                return true
            number /= i
        }
    }
    return false
}