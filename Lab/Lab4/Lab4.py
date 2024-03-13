class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right
        
def main():
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.left.left = TreeNode(1)
    root.right = TreeNode(8)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    print(invertTree(root))
    
def invertTree(curr):
    if(curr == None):
        return
    temp = curr.right
    curr.right = curr.left
    curr.left = temp
    invertTree(curr.left)
    invertTree(curr.right)
    
if __name__ == "__main__":
    main()


