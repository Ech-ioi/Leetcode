import java.util.Arrays;

public class num66 {
    public static void main(String[] args){
        Solution66 solution66=new Solution66();
        int nums[]={9};
        System.out.println(Arrays.toString(solution66.plusOne(nums)) );
    }
}
class Solution66 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(digits[len-1]<9){
            digits[len-1]=digits[len-1]+1;
            return digits;
        }
        int i=len-1;
        while(i>=0){
            if(digits[i]+1<10){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
                i--;
            }
        }
        int[] res=new int[len+1];
        res[0]=1;
        return res;

    }
}
