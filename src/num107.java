import java.util.*;

public class num107 {

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
class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> elms= new LinkedList<>();
        elms.offer(root);
        while(elms.size()!=0){
            List<Integer> list=new ArrayList<>();
            int size=elms.size();
            for(int i=0;i<size;i++){
                TreeNode node=elms.poll();
                list.add(node.val);
                if(node.left!=null) elms.offer(node.left);
                if(node.right!=null) elms.offer(node.right);
            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}
