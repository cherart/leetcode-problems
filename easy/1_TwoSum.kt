package easy

/*
1. Two Sum
https://leetcode.com/problems/two-sum/description/

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


fun twoSum(nums: IntArray, target: Int): IntArray {

    val result = IntArray(2)
    val map = HashMap<Int, Int>()
    for (i in 0 until nums.size) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i
            result[0] = map[target - nums[i]]!!
        }
        map[nums[i]] = i
    }
    return result
}