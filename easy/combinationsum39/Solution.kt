package cherart.easy.combinationsum39

import java.util.*

    /*
    39. Combination Sum

    Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

    The same repeated number may be chosen from candidates unlimited number of times.

    Note:

    All numbers (including target) will be positive integers.
    The solution set must not contain duplicate combinations.

    Example 1:

    Input: candidates = [2,3,6,7], target = 7,
    A solution set is:
    [
    [7],
    [2,2,3]
    ]

    Example 2:

    Input: candidates = [2,3,5], target = 8,
    A solution set is:
    [
    [2,2,2,2],
    [2,3,3],
    [3,5]
    ]
    */

class Solution {

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val list: MutableList<MutableList<Int>> = ArrayList()
        candidates.sort()
        recursion(candidates, list, ArrayList(), target, 0)
        return list
    }

    private fun recursion(nums: IntArray, list: MutableList<MutableList<Int>>, tempList: MutableList<Int>, target: Int, start: Int) {
        when {
            target < 0 -> return
            target == 0 -> list.add(ArrayList(tempList))
            else -> for (i in start until nums.size) {
                tempList.add(nums[i])
                recursion(nums, list, tempList, target - nums[i], i)
                tempList.removeAt(tempList.size - 1)
            }
        }
    }
}