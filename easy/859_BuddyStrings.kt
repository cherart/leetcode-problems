package easy

/*
859. Buddy Strings My SubmissionsBack to Contest

Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.

Example 1:

Input: A = "ab", B = "ba"
Output: true

Example 2:

Input: A = "ab", B = "ab"
Output: false

Example 3:

Input: A = "aa", B = "aa"
Output: true

Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true

Example 5:

Input: A = "", B = "aa"
Output: false


Note:

0 <= A.length <= 20000
0 <= B.length <= 20000
A and B consist only of lowercase letters.
*/

fun buddyStrings(A: String, B: String): Boolean {
    var c1 = '*'
    var c2 = '*'
    var diff = 0
    if (A.length != B.length || A.length < 2 || B.length < 2) {
        return false
    } else if (A.reversed() == B){
        return true
    } else {
        for (i in A.indices) {
            if (A[i] != B[i]) {
                diff++
                if (diff == 1) {
                    c1 = A[i]
                    c2 = B[i]
                } else if (diff == 2) {
                    if (A[i] != c2 || B[i] != c1) return false
                } else {
                    return false
                }
            }
        }
    }

    if (diff == 2) return true

    val set = HashSet<Char>()
    for (i in A.indices) {
        if (set.contains(A[i]))
            return true
        set.add(A[i])
    }
    return false
}
