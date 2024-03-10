package HomeWork.HomeWork9;

import javax.swing.tree.TreeNode;

public class HomeWork9{
    public static void main(String[] args) {
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int lower;
        int higher;
        if(p.val < q.val){
            lower = p.val;
            higher = q.val;
        }else{
            lower = q.val;
            higher = p.val;
        }
        TreeNode curr = root;
        while(true){
            if(curr.val >= lower && curr.val <= higher){
                return curr;
            }
            if(curr.val < lower){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
    }
    public class TreeNode {

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
   
}