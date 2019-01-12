"""
965. Univalued Binary Tree Easy

A binary tree is univalued if every node in the tree has the same value.

Return
true if and only if the given tree is univalued.

Example 1:
Input: [1, 1, 1, 1, 1, null, 1]
Output: true

Example 2:
Input: [2, 2, 2, 5, 2]
Output: false

Note:

The number of nodes in the given tree will be in the range[1, 100].
Each node's value will be an integer in the range [0, 99].
"""
from TreeNode import TreeNode


class Solution:
    def isUnivalTree(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """

        return self.recursion(root, root.val)

    def recursion(self, root, previous):
        if root is None:
            return True
        elif root.val == previous:
            return True and self.recursion(root.right, root.val) and self.recursion(root.left, root.val)
        else:
            return False


t1 = TreeNode(1)
t1.left = TreeNode(1)
t1.right = TreeNode(1)
t1.right.right = TreeNode(2)

print(Solution().isUnivalTree(t1))
