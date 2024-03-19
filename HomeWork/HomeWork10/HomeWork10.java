package HomeWork.HomeWork10;

import java.util.*;

public class HomeWork10{
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
       
        System.out.println(levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
       // Your code here
       List<List<Integer>> retList = new ArrayList<List<Integer>>();
       
       levelOrderHelper(root, retList, 0);
        return retList;
    }
    public static void levelOrderHelper(TreeNode curr, List<List<Integer>> retList, int level){
        if(curr != null){
            if(retList.size() <= level){
                retList.add(new ArrayList<Integer>());
            }
            retList.get(level).add(curr.val);
            levelOrderHelper(curr.left, retList, level+1);
            levelOrderHelper(curr.right, retList, level+1);
        }
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