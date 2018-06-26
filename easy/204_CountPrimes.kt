package easy

/*
204. Count Primes

Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/

fun countPrimes(n: Int): Int {
    val notPrime = BooleanArray(n)
    var count = 0
    for (i in 2 until n) {
        if (!notPrime[i]) {
            count++
            var j = 2
            while (i * j < n) {
                notPrime[i * j] = true
                j++
            }
        }
    }
    return count
}