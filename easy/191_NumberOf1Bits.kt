package easy

/*
191. Number of 1 Bits

Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Example 1:

Input: 11
Output: 3
Explanation: Integer 11 has binary representation 00000000000000000000000000001011

Example 2:

Input: 128
Output: 1
Explanation: Integer 128 has binary representation 00000000000000000000000010000000
*/

fun hammingWeight(n: Int): Int {
    var num = n
    var i = 0
    while (num != 0) {
        i += (num and 1)
        num = num ushr 1
    }
    return i
}