package medium

/*
78. Subsets

Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
[3],
[1],
[2],
[1,2,3],
[1,3],
[2,3],
[1,2],
[]
]
*/

fun subsets(nums: IntArray): List<List<Int>> {
    val resultList = ArrayList<List<Int>>()
    resultList.add(emptyList())
    for (i in nums.lastIndex downTo 0) {
        val temp = mutableListOf<Int>(nums[i])
        resultList.add(temp)
        for (j in 0 until resultList.indexOf(temp)) {
            var t = mutableListOf<Int>()
            t.addAll(temp)
            t.addAll(resultList[j])
            if (!resultList.contains(t))
                resultList.add(t)
        }
    }
    return resultList
}