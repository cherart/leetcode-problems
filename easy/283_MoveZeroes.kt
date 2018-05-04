package easy

/*
283. Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

fun moveZeroes(nums: IntArray) {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == 0 && nums[j] != 0) {
                swap(nums, i, j)
                break
            }
        }
    }
}

private fun swap(array: IntArray, first: Int, second: Int) {
    val third = array[first]
    array[first] = array[second]
    array[second] = third
}