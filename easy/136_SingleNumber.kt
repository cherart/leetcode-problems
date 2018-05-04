package easy

/*
136. Single Number

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

fun singleNumber(nums: IntArray): Int {
    val arrayList = ArrayList<Int>()
    for (i in 0 until nums.size) {
        if (arrayList.contains(nums[i]))
            arrayList.remove(nums[i])
        else
            arrayList.add(nums[i])
    }
    return arrayList.first()
}