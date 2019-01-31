"""
506. Relative Ranks

Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:

N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
"""


class Solution:
    def findRelativeRanks(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        nums_copy = nums.copy()
        diction = {}
        for i in range(0, len(nums)):
            temp = max(nums_copy)
            if i == 0:
                diction[temp] = "Gold Medal"
            elif i == 1:
                diction[temp] = "Silver Medal"
            elif i == 2:
                diction[temp] = "Bronze Medal"
            else:
                diction[temp] = str(i + 1)
            nums_copy.remove(temp)
        for i in range(0, len(nums)):
            nums[i] = diction[nums[i]]
        return nums
