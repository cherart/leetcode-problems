package medium

import java.util.*

/*
46. Permutations

Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
[1,2,3],
[1,3,2],
[2,1,3],
[2,3,1],
[3,1,2],
[3,2,1]
]
*/

fun permute(nums: IntArray): List<List<Int>> {
    val list = ArrayList<List<Int>>()
    backtrack(list, ArrayList(), nums)
    return list
}

private fun backtrack(list: MutableList<List<Int>>, tempList: MutableList<Int>, nums: IntArray) {
    if (tempList.size == nums.size) {
        list.add(ArrayList(tempList))
    } else {
        for (i in nums.indices) {
            if (tempList.contains(nums[i])) continue
            tempList.add(nums[i])
            backtrack(list, tempList, nums)
            tempList.removeAt(tempList.size - 1)
        }
    }
}
