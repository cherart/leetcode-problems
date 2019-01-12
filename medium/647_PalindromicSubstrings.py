"""
647. Palindromic Substrings

Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

Note:
The input string length won't exceed 1000.

"""


class Solution:
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = len(s)

        for i in range(0, len(s)):
            for j in range(len(s) - 1, i, -1):
                if s[i] == s[j]:
                    count += 1
                    if i - j != 1:
                        for k in range(1, (j - i + 1) // 2):
                            if s[k + i] != s[j - k]:
                                count -= 1
                                break

        return count
