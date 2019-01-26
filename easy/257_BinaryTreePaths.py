"""
257. Binary Tree Paths

Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from TreeNode import TreeNode


class Solution:
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        if root is None:
            return []
        elif root.left is None or root.right is None:
            if root.left is None and root.right is None:
                return [str(root.val)]
            elif root.left is None:
                rslt = self.binaryTreePaths(root.right)
                for i in range(0, len(rslt)):
                    rslt[i] = str(root.val) + "->" + rslt[i]
                return rslt
            else:
                rslt = self.binaryTreePaths(root.left)
                for i in range(0, len(rslt)):
                    rslt[i] = str(root.val) + "->" + rslt[i]
                return rslt
        else:
            rslt1 = self.binaryTreePaths(root.left)
            rslt2 = self.binaryTreePaths(root.right)
            rslt = rslt1 + rslt2
            for i in range(0, len(rslt)):
                rslt[i] = str(root.val) + "->" + rslt[i]
            return rslt
