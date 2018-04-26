package cherart.easy.toeplitzmatrix766

fun main (args: Array<String>) {
    val solution = Solution()
    val first = intArrayOf (1,2,3,4)
    val second = intArrayOf(5,1,2,3)
    val third = intArrayOf (9,5,1,2)
    val fourth = intArrayOf(8,9,5,2)

    val one = intArrayOf  (53,64,90,98,34)
    val two = intArrayOf  (91,53,64,90,98)
    val three = intArrayOf(17,91,53,64,0)
    print(solution.isToeplitzMatrix(arrayOf(one, two, three)))

}