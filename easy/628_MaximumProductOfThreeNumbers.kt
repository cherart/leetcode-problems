package easy

/*
628. Maximum Product of Three Numbers

Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:
Input: [1,2,3]
Output: 6

Example 2:
Input: [1,2,3,4]
Output: 24

Note:
1.The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
2.Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
*/


fun maximumProduct(nums: IntArray): Int {
    nums.sort()
    val a = nums[0] * nums[1] * nums[nums.lastIndex]
    val b = nums[nums.lastIndex] * nums[nums.lastIndex - 1] * nums[nums.lastIndex - 2]
    return if (a > b) a else b
}