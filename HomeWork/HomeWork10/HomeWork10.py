class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def level_order(root):
    ret_list = []
    level_order_helper(root, ret_list, 0)
    return ret_list

def level_order_helper(curr, ret_list, level):
    if curr:
        if len(ret_list) <= level:
            ret_list.append([])
        ret_list[level].append(curr.val)
        level_order_helper(curr.left, ret_list, level + 1)
        level_order_helper(curr.right, ret_list, level + 1)

def main():
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.left.left = TreeNode(1)
    root.right = TreeNode(8)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)

    print(level_order(root))

if __name__ == "__main__":
    main()
