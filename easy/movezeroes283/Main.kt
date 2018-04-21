package cherart.easy.movezeroes283

fun main (args: Array<String>) {
    val solution = Solution()
    val nums:IntArray = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(nums)
    System.out.print(nums.joinToString())
}