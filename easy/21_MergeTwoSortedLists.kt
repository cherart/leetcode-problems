package easy

import helpers.ListNode

/*
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/


fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null)
        return l2
    else if (l2 == null)
        return l1

    var mergedNode: ListNode

    if (l1.`val` <= l2.`val`) {
        mergedNode = ListNode(l1.`val`)
        mergedNode.next = mergeTwoLists(l1.next, l2)
    } else {
        mergedNode = ListNode(l2.`val`)
        mergedNode.next = mergeTwoLists(l1, l2.next)
    }
    return mergedNode
}