package easy

/*
844. Backspace String Compare

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".

Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".

Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".

Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
*/

fun backspaceCompare(S: String, T: String): Boolean {
    var first = StringBuilder()
    var second = StringBuilder()
    var symbolsToDelete = 0

    for (i in S.lastIndex downTo 0) {
        if (S[i] != '#' && symbolsToDelete > 0) {
            symbolsToDelete--
            continue
        } else if (S[i] != '#') {
            first.append(S[i])
        } else {
            symbolsToDelete++
        }
    }
    symbolsToDelete = 0
    for (i in T.lastIndex downTo 0) {
        if (T[i] != '#' && symbolsToDelete > 0) {
            symbolsToDelete--
            continue
        } else if (T[i] != '#') {
            second.append(T[i])
        } else {
            symbolsToDelete++
        }
    }

    return first.toString() == second.toString()
}