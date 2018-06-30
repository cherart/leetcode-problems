package easy

import helpers.ListNode

/*
83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
*/

fun deleteDuplicates(head: ListNode?): ListNode? {
    if (head == null)
        return null
    head.next = deleteDuplicates(head.next)
    return if (head.next != null && head.next?.`val` == head.`val`) head.next else head
}