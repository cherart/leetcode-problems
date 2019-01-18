"""
908. Smallest Range I

Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the minimum value of B.

Example 1:
Input: A = [1], K = 0
Output: 0
Explanation: B = [1]

Example 2:
Input: A = [0,10], K = 2
Output: 6
Explanation: B = [2,8]

Example 3:
Input: A = [1,3,6], K = 3
Output: 0
Explanation: B = [3,3,3] or B = [4,4,4]

Note:
1 <= A.length <= 10000
0 <= A[i] <= 10000
0 <= K <= 10000
"""


class Solution:
    def smallestRangeI(self, A, K):
        """
        :type A: List[int]
        :type K: int
        :rtype: int
        """
        maxA = max(A)
        minA = min(A)
        if maxA - minA > 2 * K:
            return (maxA - K) - (minA + K)
        else:
            return 0