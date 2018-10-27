public class num108 {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        return find(nums,0,nums.length-1);
    }
    private TreeNode find(int[] nums,int min,int max){
        if(min>max) return null;
        int mid=(min+max)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=find(nums,min,mid-1);
        node.right=find(nums,mid+1,max);
        return node;
    }
}