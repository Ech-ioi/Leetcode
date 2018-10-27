public class num53 {
    public static void main(String[] args){

    }

}
class Solution53 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int local=nums[0];
        int global=nums[0];
        for(int i=1;i<nums.length;i++){
            local=Math.max(nums[i]+local,nums[i]);
            global=Math.max(global,local);
        }
        return global;
    }
}
