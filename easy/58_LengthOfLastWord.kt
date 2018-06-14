package easy

/*
58. Length of Last Word

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/

fun lengthOfLastWord(s: String): Int {
    var count = 0
    for (i in s.lastIndex downTo 0) {
        if (s[i] == ' ') {
            if (count == 0)
                continue
            else
                return count
        } else {
            count++
        }
    }
    return count
}