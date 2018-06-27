package easy

import java.util.*

/*
20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

Example 4:

Input: "([)]"
Output: false

Example 5:

Input: "{[]}"
Output: true
*/

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (i in s) {
        when {
            i == '(' -> stack.push(')')
            i == '{' -> stack.push('}')
            i == '[' -> stack.push(']')
            stack.isEmpty() || stack.pop() != i -> return false
        }
    }
    return stack.isEmpty()
}
