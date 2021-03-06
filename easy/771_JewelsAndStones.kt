package easy

/*
771. Jewels and Stones
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:

Input: J = "z", S = "ZZ"
Output: 0

Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
*/

fun numOfJewelsInStone(J: String, S: String): Int {
    var numberOfJewels = 0
    val jewels: CharArray = J.toCharArray()
    val stones: CharArray = S.toCharArray()
    for (i in 0 until jewels.size) {
        val jewelElement = jewels[i]
        for (j in 0 until stones.size) {
            val stoneElement = stones[j]
            if (stoneElement == jewelElement)
                numberOfJewels++
        }
    }
    return numberOfJewels
}