public class num35 {
    public static void main(String[] args){

    }
}
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]-target>=0) return i;
        return nums.length;
    }
}