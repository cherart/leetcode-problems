"""
500. Keyboard Row

Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Example:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]


Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
"""


class Solution:
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        first_row = "qwertyuiop"
        second_row = "asdfghjkl"
        third_row = "zxcvbnm"
        result = []
        for w in words:
            row = ""
            if w[0].lower() in first_row:
                row = first_row
            elif w[0].lower() in second_row:
                row = second_row
            else:
                row = third_row
            for i in range(0, len(w)):
                if w[i].lower() not in row:
                    break
                if i == len(w) - 1 and w[i].lower() in row:
                    result.append(w)
        return result
