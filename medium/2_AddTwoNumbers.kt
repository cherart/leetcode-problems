package medium

import helpers.ListNode


/*
2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var ll1 = l1
    var ll2 = l2

    val head = ll1 ?: ll2
    var tail: ListNode? = head

    var sum = 0
    var carry = 0

    while (ll1 != null || ll2 != null) {
        sum = carry + (ll1?.`val` ?: 0) + (ll2?.`val` ?: 0)
        tail!!.`val` = sum % 10
        carry = sum / 10

        ll1 = if (ll1 != null) ll1.next else ll1
        ll2 = if (ll2 != null) ll2.next else ll2

        tail.next = ll1 ?: (ll2 ?: if (carry != 0) ListNode(carry) else null)
        tail = tail.next
    }

    return head
}
