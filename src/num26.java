class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]) nums[++i]=nums[j];
        }
        return i+1;
    }
}
public class num26 {
    public static void main(String[] args){

    }
}
