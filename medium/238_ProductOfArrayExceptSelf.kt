package medium

/*
238. Product of Array Except Self

Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]

Note: Please solve it without division and in O(n).
*/

fun productExceptSelf(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    var product = 1
    for (i in 0 until array.size) {
        for (j in 0 until nums.size) {
            if (j != i)
                product *= nums[j]
        }
        array[i] = product
        product = 1
    }
    return array
}