package easy

/*
53. Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

fun maxSubArray(nums: IntArray): Int {
    if (nums.size == 1)
        return nums[0]
    var local: Int = nums[0]
    var global: Int = nums[0]
    for (i in 1 until nums.size) {
        if (local < 0)
            local = Math.max(local, nums[i])
        else
            local = Math.max(local + nums[i], 0)
        global = Math.max(local, global)
    }
    return global
}