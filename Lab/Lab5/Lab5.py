import sys
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
def isValidBST(root):
    return isValidHelper(root.left, -sys.maxsize - 1, root.val) and isValidHelper(root.left, root.val, sys.maxsize)
def isValidHelper(root, lower, upper):
    if(root is None):
        return True
    if not (lower < root.val < upper):
        return False
    return isValidHelper(root.left, lower, root.val) and isValidHelper(root.right, root.val, upper)

def main():
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.left.left = TreeNode(1)
    root.right = TreeNode(8)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    print(isValidBST(root))

if __name__ == "__main__":
    main()
    

    
