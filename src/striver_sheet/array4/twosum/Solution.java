package striver_sheet.array4.twosum;

import java.util.Arrays;

class Solution {
    public static boolean twoSum(int[] nums, int target) {
       int s =0;
       int e = nums.length-1;

       Arrays.sort(nums);
    
        while(s < e){
            if(nums[s] + nums[e] > target)
                e--;
            else if(nums[s] + nums[e] < target)
                s++;
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        System.out.println((twoSum(arr, target)));
    }
}