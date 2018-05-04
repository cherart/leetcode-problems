package cherart.easy

/*
415. Add Strings

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

fun addStrings(num1: String, num2: String): String {
    val result = StringBuilder()
    val num1Array = num1.reversed().toCharArray()
    val num2Array = num2.reversed().toCharArray()
    var temp1: Int = 0
    var isTen = false
    val size = if (num1Array.size > num2Array.size) num1Array.size else num2Array.size
    for (i in 0 until size) {
        val num1Int = if (i > num1Array.size - 1) 0 else Character.getNumericValue(num1Array[i])
        val num2Int = if (i > num2Array.size - 1) 0 else Character.getNumericValue(num2Array[i])
        val sum = num1Int + num2Int + if (isTen) 1 else 0
        temp1 = sum % 10
        isTen = sum / 10 > 0
        result.insert(0, temp1.toString())
        if (i == size - 1 && isTen)
            result.insert(0, "1")
    }
    return result.toString()
}