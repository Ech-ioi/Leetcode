public class num104 {
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
class Solution104 {

    public int maxDepth(TreeNode root) {
        int count=0;
        return count(root,count);
    }
    public int count(TreeNode root,int cnt){
        if(root==null) return cnt;
        else{
            cnt=Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
            return cnt;
        }
    }
}