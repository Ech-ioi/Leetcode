public class num69 {
    public static void main(String[] args){
        Solution69 solution69=new Solution69();
        System.out.println(solution69.mySqrt(4));
    }
}
class Solution69 {
    public int mySqrt(int x) {
        if(x<=0) return 0;
        if(x==1) return 1;
        long half= x/2;
        while(half*half>x)
            half=half/2;
        while(half*half<=x)
            half++;
        return (int)half-1;
    }
}