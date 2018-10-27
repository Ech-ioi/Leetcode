public class num110 {
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean result=true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }
    private int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        int left=maxDepth(node.left);
        int right=maxDepth(node.right);
        if(Math.abs(left-right)>1) result=false;
        return 1+Math.max(left,right);
    }

}