"""
404. Sum of Left Leaves
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from TreeNode import TreeNode


class Solution:
    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        return self.recursion(root)

    def recursion(self, root):
        # if root.left is None and root.right is None:
        #     return root.val
        # elif root.left is None or root.right is None:
        #     if root.left is None:
        #         return self.recursion(root.right)
        #     else:
        #         return self.recursion(root.left)
        # else:
        #     return self.recursion(root.left) + self.recursion(root.right)
        if root is None:
            return 0
        if root.left is None or root.right is None:
            if root.left is None and root.right is None:
                return 0
            elif root.left is None:
                return self.recursion(root.right)
            else:
                if root.left.left is None and root.left.right is None:
                    return root.left.val
                else:
                    return self.recursion(root.left)
        else:
            if root.left.left is None and root.left.right is None:
                return root.left.val + self.recursion(root.right)
            else:
                return self.recursion(root.left) + self.recursion(root.right)
