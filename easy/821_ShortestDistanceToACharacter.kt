package easy

/*
821. Shortest Distance to a Character

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]


Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
*/

fun shortestToChar(S: String, C: Char): IntArray {
    val intArray = IntArray(S.length)
    val array = ArrayList<Int>()
    val arrayTwo = ArrayList<Int>()
    var start = S.indexOf(C, 0)
    if (start != -1)
    array.add(start)

    while (start != -1) {
        start = S.indexOf(C, start + 1)
        if (start != -1)
            array.add(start)
    }

    for (i in 0 until intArray.size) {
        for (j in array) {
            arrayTwo.add(Math.abs(j - i))
        }
        intArray[i] = arrayTwo.min()!!
        arrayTwo.clear()
    }
    return intArray
}