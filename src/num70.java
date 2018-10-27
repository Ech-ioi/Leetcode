public class num70 {
    public static void main(String args[]){
        Solution70 solution70=new Solution70();
        System.out.println(solution70.climbStairs(2));
    }
}
class Solution70 {//递归

    public int climbStairs(int n) {
        return clim(0,n);
    }
    public int clim(int i,int n){
        if(i>n) return 0;
        if(i==n) return 1;
        return clim(i+1,n)+clim(i+2,n);
    }
}
class OtherSolution70 {//非递归

    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] result = new int[n + 1];
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}