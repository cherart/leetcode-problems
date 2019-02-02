"""
520. Detect Capital
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:
Input: "USA"
Output: True

Example 2:
Input: "FlaG"
Output: False

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
"""


class Solution:
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        is_upper = True
        is_lower = True
        for i in range(0, len(word)):
            if i > 0:
                if word[i].isupper():
                    if is_upper:
                        is_lower = False
                    else:
                        return False
                else:
                    if not is_lower:
                        return False
                    if is_upper:
                        is_upper = False
            elif i == 0 and word[i].islower():
                is_upper = False
        return True
