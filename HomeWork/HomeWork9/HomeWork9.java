package HomeWork.HomeWork9;


public class HomeWork9{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        System.out.println(lowestCommonAncestor(root,root.right.left, root.right.right).val + " is the lowest common ancestor");

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
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