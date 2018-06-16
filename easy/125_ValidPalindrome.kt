package easy

/*
125. Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
*/

fun isPalindrome(s: String): Boolean {
    val str = s.toLowerCase().replace("\\W".toRegex(), "")
    return str == str.reversed()
}