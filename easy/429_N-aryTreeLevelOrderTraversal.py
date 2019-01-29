"""
429. N-ary Tree Level Order Traversal

Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example, given a 3-ary tree:

We should return its level order traversal:

[
     [1],
     [3,2,4],
     [5,6]
]


Note:

The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
"""
from Node import Node

"""
# Definition for a Node.
class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""


class Solution:
    def levelOrder(self, root):
        """
        :type root: Node
        :rtype: List[List[int]]
        """
        if root is None:
            return []
        val_list = []
        children_list = [root]
        while True:
            lst = []
            next_children_list = []
            for c in children_list:
                lst.append(c.val)
                next_children_list += c.children
            val_list.append(lst)
            children_list = next_children_list
            if not children_list:
                return val_list


n = Node(1, [Node(3, [Node(5, []), Node(6, [])]), Node(2, []), Node(4, [])])
print(Solution().levelOrder(n))
n = Node(1, [])
print(Solution().levelOrder(n))
n = Node(1, [])
print(Solution().levelOrder(n))
print(Solution().levelOrder(None))
