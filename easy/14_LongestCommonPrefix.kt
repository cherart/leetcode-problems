package easy

/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    } else {
        val result = StringBuilder("")
        var minStr = strs[0]
        var previous = '*'

        for (s in strs)
            minStr = if (Math.min(minStr.length, s.length) == minStr.length) minStr else s


        for (i in 0 until minStr.length) {
            for (j in 0 until strs.size) {
                if (j == 0)
                    previous = strs[j][i]
                if (strs[j][i] != previous)
                    return result.toString()
                if (j == strs.lastIndex)
                    result.append(previous)
            }
        }
        return result.toString()
    }
}