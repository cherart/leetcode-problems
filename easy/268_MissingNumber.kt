package easy

/*
268. Missing Number

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2

Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/

fun missingNumber(nums: IntArray): Int {
    nums.sort()
    var missed = 0
    loop@ for (i in 0 until nums.size) {
        when {
            nums[0] != 0 -> {
                missed = 0
                break@loop
            }
            nums[0] == 0 && nums.size == 1 -> {
                missed = 1
                break@loop
            }
                i > 0 && nums[i] - nums[i-1] != 1 -> {
                missed = nums[i] - 1
                break@loop
            }
            else -> missed = nums[i] + 1

        }
    }
    return missed
}