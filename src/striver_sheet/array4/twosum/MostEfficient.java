package striver_sheet.array4.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostEfficient {
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                ans[0] =  hm.get(target - nums[i]);
                ans[1] = i;
            }
            hm.put(nums[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
