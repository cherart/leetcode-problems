package medium

import java.lang.StringBuilder

/*
3. Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

fun lengthOfLongestSubstring(s: String): Int {
    var count = 0
    var stringBuilder = StringBuilder()

    for (i in s.indices) {
        if (stringBuilder.contains(s[i])) {
            count = Math.max(stringBuilder.length, count)
            stringBuilder = StringBuilder(stringBuilder.removeRange(0, stringBuilder.indexOf(s[i]) + 1))
        }
        stringBuilder.append(s[i])
    }

    count = Math.max(stringBuilder.length, count)

    return count
}