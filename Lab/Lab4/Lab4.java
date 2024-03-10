package Lab.Lab4;
 public class Lab4{
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        printTree(root);
        invertTree(root);
        printTree(root);
    }
    public static void printTree(TreeNode root){
        if(root == null){
            return;
        }
        printTree(root.right);
        System.out.print(root.val);
        printTree(root.left);

    }
    public static void invertTree(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.right);
        invertTree(root.left);
    }
 }
 class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }

 }