package easy

/*
804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation:
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".

Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.
*/

fun uniqueMorseRepresentations(word: Array<String>): Int {
    val map = getMap()
    var arr: CharArray
    val allMorse: MutableList<String> = mutableListOf()
    for (w in word) {
        arr = w.toCharArray()
        val stringBuilder = StringBuilder()
        for (c in arr) {
            stringBuilder.append(map[c])
        }
        if (!allMorse.contains(stringBuilder.toString()))
            allMorse.add(stringBuilder.toString())

    }
    return allMorse.size
}

fun getMap(): Map<Char, String> {
    val map = HashMap<Char, String>()
    val arrayString = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    for (i in 0 until arrayString.size) {
        map['a' + i] = arrayString[i]
    }
    return map
}