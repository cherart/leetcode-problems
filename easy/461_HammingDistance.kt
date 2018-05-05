package easy

/*
461. Hamming Distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2
*/

fun hammingDistance(x: Int, y: Int): Int {
    var byte = x.xor(y)
    var i = 0
    while (Math.abs(byte) > 0) {
        if (byte % 2 == 1)
            i++
        byte = (byte shr 1)
    }
    return i
}