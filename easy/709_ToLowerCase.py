"""
709. To Lower Case

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:
Input: "Hello"
Output: "hello"

Example 2:
Input: "here"
Output: "here"

Example 3:
Input: "LOVELY"
Output: "lovely"
"""

class Solution:
	def toLowerCase(self, str):
		result = ""
		for s in str:
			num = ord(s)
			if num in range(65, 91):
				num += 32
			result += chr(num)
		return result
