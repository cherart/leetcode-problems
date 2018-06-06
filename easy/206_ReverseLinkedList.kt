package easy

import helpers.ListNode

/*
206. Reverse Linked List

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

fun reverseList(head: ListNode?): ListNode? {
    var headTwo = head
    var newHead: ListNode? = null
    while (headTwo != null) {
        val next = headTwo.next
        headTwo.next = newHead
        newHead = headTwo
        headTwo = next
    }
    return newHead
}