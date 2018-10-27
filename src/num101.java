public class num101 {
}
//class TreeNode {
//    public int val;
//    public TreeNode left;
//    public TreeNode right;
//    TreeNode(int x) { val = x; }
//
//}
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root,root);
    }
    public boolean Symmetric(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null) return true;
        if(root1==null||root2==null) return false;
        return (root1.val==root2.val)&&
                Symmetric(root1.left,root2.right)&&
                Symmetric(root1.right,root2.left);

    }
}