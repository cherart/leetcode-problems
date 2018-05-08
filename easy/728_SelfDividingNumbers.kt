package easy

/*
728. Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
*/

fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (index in left..right) {
        var i = index
        while (i > 0) {
            if (i % 10 == 0 || index % (i % 10) != 0)
                break
            else if (i / 10 == 0) {
                list.add(index)
                break
            }
            i /= 10
        }
    }
    return list.toList()
}