package cherart.easy

/*
657. Judge Route Circle

Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.

Example 1:

Input: "UD"
Output: true

Example 2:

Input: "LL"
Output: false
*/

fun judgeCircle(moves: String): Boolean {
    var width = 0
    var height = 0
    val movesArray: CharArray = moves.toCharArray()
    for (i in 0 until movesArray.size) {
        val move: Char = movesArray[i]
        when (move) {
            'U' -> height++
            'D' -> height--
            'R' -> width++
            'L' -> width--
        }
    }
    return width == 0 && height == 0
}