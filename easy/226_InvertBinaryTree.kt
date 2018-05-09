package easy

import helpers.TreeNode

/*
226. Invert Binary Tree

Invert a binary tree.

Example:

Input:

      4
    /   \
   2     7
  / \   / \
 1   3 6   9

Output:

      4
    /   \
   7     2
  / \   / \
 9   6 3   1
*/

fun invertTree(root: TreeNode?): TreeNode? {

    if (root == null)
        return null

    val treeNode = TreeNode(root!!.`val`)
    treeNode.left = invertTree(root.right)
    treeNode.right = invertTree(root.left)

    return treeNode
}