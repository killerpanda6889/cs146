class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        lower = min(p.val, q.val)
        higher = max(p.val, q.val)
        
        curr = root
        
        while True:
            if lower <= curr.val <= higher:
                return curr
            if curr.val < lower:
                curr = curr.right
            else:
                curr = curr.left


# Example usage:
if __name__ == "__main__":
    # Construct the tree
    root = TreeNode(6)
    root.left = TreeNode(2)
    root.right = TreeNode(8)
    root.left.left = TreeNode(0)
    root.left.right = TreeNode(4)
    root.left.right.left = TreeNode(3)
    root.left.right.right = TreeNode(5)
    root.right.left = TreeNode(7)
    root.right.right = TreeNode(9)

    # Create an instance of the solution
    solution = Solution()

    # Find lowest common ancestor
    p_node = root.left
    q_node = root.right
    lca_node = solution.lowestCommonAncestor(root, p_node, q_node)
    print("Lowest Common Ancestor:", lca_node.val)
