import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
public class num1{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        int[] results=new int[2];
        Solution1 solution=new Solution1();

        results=solution.twoSum(nums,target);
        System.out.println(Arrays.toString(results));
    }
}

