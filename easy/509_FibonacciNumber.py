"""
509. Fibonacci Number Easy
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that
each number is the sum of the two preceding ones, starting from0 and 1. That is,

F(0) = 0, F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.

Given N, calculateF(N).

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
"""


class Solution:
    def fib(self, N):
        """
        :type N: int
        :rtype: int
        """
        return self.fastFib(N, 0, 1)

    def fastFib(self, N, n1, n2):
        if N == 0:
            return n1
        elif N == 1 or N == 2:
            return n1 + n2
        else:
            return self.fastFib(N-1, n2, n1 + n2)
