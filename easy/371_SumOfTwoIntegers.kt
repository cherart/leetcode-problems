package easy

/*
371. Sum of Two Integers

Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
*/

fun getSum(a: Int, b: Int): Int {
    var A = a
    var B = b
    while (B != 0) {
        val temp = A and B
        A = A xor B
        B = temp shl 1
    }
    return  A
}