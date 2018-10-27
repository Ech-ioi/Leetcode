
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }

}

class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1,s2;
        s1=new Stack<>();
        s2=new Stack<>();
        if(p!=null) s1.push(p);
        if(q!=null) s2.push(q);
        if(s1.size()!=s2.size()) return false;
        while(!s1.isEmpty()&&!s2.isEmpty()){
            TreeNode t1=s1.pop();
            TreeNode t2=s2.pop();
            if(t1.val!=t2.val) return false;
                if(t1.right!=null) s1.push(t1.right);
                if(t2.right!=null) s2.push(t2.right);
            if(s1.size()!=s2.size()) return false;
            if(t1.left!=null) s1.push(t1.left);
            if(t2.left!=null) s2.push(t2.left);
            if(s1.size()!=s2.size()) return false;
        }
        return s1.size()==s2.size();
    }
}

public class num100 {

    public static void main(String[] args){
        for(int i=0; i<args.length; i++)
            System.out.println(args[i]);
    }




}