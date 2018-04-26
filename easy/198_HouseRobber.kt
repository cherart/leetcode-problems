package cherart.easy

/*
198. House Robber¡

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
of money you can rob tonight without alerting the police.
*/

fun rob(nums: IntArray): Int {
    var sumOne = 0
    var sumTwo = 0

    for (i in 0 until nums.size) {
        if (i % 2 == 0)
            sumOne = max(sumOne + nums[i], sumTwo)
        else
            sumTwo = max(sumOne, sumTwo + nums[i])
    }
    return max(sumOne, sumTwo)
}

private fun max(first: Int, second: Int): Int {
    return if (first > second) first else second
}