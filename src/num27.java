import java.util.Arrays;

class Solution27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=0;j<nums.length;j++) {
            if (nums[j] == val) continue;
            else nums[i++]=nums[j];
        }
        return i;
    }
}
public class num27 {
    public static void main(String[] args){
        Solution27 solution27=new Solution27();
        int nums[]={};
        System.out.println(solution27.removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
}

