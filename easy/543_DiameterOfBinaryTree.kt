package easy

import helpers.TreeNode

/*
543. Diameter of Binary Tree

Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
        1
       / \
      2   3
     / \
    4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
*/

var sum = 1

fun diameterOfBinaryTree(root: TreeNode?): Int {
    depth(root)
    return sum - 1
}

fun depth(root: TreeNode?): Int {
    return if (root != null) {
        val left = depth(root.left)
        val right = depth(root.right)
        sum = Math.max(sum, left + right + 1)
        Math.max(left, right) + 1
    } else {
        0
    }
}