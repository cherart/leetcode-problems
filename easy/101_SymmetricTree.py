"""
101. Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
"""
from TreeNode import TreeNode


class Solution:
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root is None:
            return True
        else:
            return self.recursion(root.left, root.right)

    def recursion(self, root_left, root_right):
        if root_left is None and root_right is None:
            return True
        elif root_left is None or root_right is None:
            return False
        else:
            if root_left.val == root_right.val:
                return self.recursion(root_left.left, root_right.right) and self.recursion(root_left.right,
                                                                                           root_right.left)
            else:
                return False
