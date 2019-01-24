"""
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
"""


class Solution:
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # dictionary = dict(zip(s, t))
        dictionary = {}
        for i in range(0, len(s)):
            if s[i] not in dictionary.keys() and t[i] not in dictionary.values():
                dictionary[s[i]] = t[i]
        for i in range(0, len(s)):
            if s[i] not in dictionary.keys() or t[i] not in dictionary.values() or dictionary[s[i]] != t[i]:
                return False
        return True
