package easy

/*
190. Reverse Bits

Reverse bits of a given 32 bits unsigned integer.

Example:

Input: 43261596
Output: 964176192
Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
return 964176192 represented in binary as 00111001011110000010100101000000.
*/

fun reverseBits(n: Int): Int {
    var num = n
    var reverse = 0
    for (i in 0..31) {
        reverse += num and 1
        num = num ushr 1
        if (i != 31) {
            reverse = reverse shl 1
        }
    }
    return reverse
}