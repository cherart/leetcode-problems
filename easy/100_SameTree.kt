package easy

import helpers.TreeNode

/*
100. Same Tree

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

       [1,2,3],   [1,2,3]

Output: true

Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false

Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
*/

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    return recurs(p, q)
}

fun recurs(p: TreeNode?, q: TreeNode?): Boolean {
    return when {
        p == null && q == null -> true
        p == null -> false
        q == null -> false
        else -> {
            if (p.`val` == q.`val`)
                recurs(p.left, q.left) and recurs(p.right, q.right)
            else
                false
        }
    }
}