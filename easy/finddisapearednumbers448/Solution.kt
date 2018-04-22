package cherart.easy.finddisapearednumbers448

class Solution {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val list = ArrayList<Int>()
        for (i in 1..nums.size) {
            if (!nums.contains(i))
                list.add(i)
        }
        return list
    }
}