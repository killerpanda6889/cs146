package Lab.Lab5;
import java.util.*;
public class Lab5 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root){
        return validHelper(root.left, Integer.MIN_VALUE, root.val) && validHelper(root.right, root.val, Integer.MAX_VALUE);
    }
    public static boolean validHelper(TreeNode root, int lower, int higher){
        if(root == null ){
            return true;
        }
        if(root.val >= higher || root.val <= lower){
            return false;
        }
        return validHelper(root.left, lower, root.val) && validHelper(root.right, root.val, higher);
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