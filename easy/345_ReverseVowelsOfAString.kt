package easy

/*
345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/

fun reverseVowels(s: String): String {
    val vowels = "aeiouAEIOU"
    val builder = StringBuilder(s)
    var firstIndex = 0
    var secondIndex = builder.lastIndex
    while (firstIndex < secondIndex) {
        when {
            vowels.contains(builder[firstIndex]) && vowels.contains(builder[secondIndex]) -> {
                swap(builder, firstIndex, secondIndex)
                firstIndex++
                secondIndex--
            }
            !vowels.contains(builder[firstIndex]) && !vowels.contains(builder[secondIndex]) -> {
                firstIndex++
                secondIndex--
            }
            !vowels.contains(builder[firstIndex]) -> firstIndex++
            !vowels.contains(builder[secondIndex]) -> secondIndex--
        }
    }
    return builder.toString()
}

fun swap(str: StringBuilder, first: Int, second: Int) {
    val temp = str[first]
    str[first] = str[second]
    str[second] = temp
}