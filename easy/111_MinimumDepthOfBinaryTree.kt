package easy

import helpers.TreeNode

/*
111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

      3
     / \
    9  20
      /  \
     15   7
return its minimum depth = 2.
*/

fun minDepth(root: TreeNode?): Int {
    if (root == null)
        return 0
    else
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1
        } else if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1
        } else if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1
        } else {
            return 1
        }
}