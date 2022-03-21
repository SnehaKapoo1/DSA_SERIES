package striver_sheet.array3.majorityn3;

import java.util.ArrayList;
import java.util.List;

public class Naive {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/3 && !ans.contains(nums[i]))
                ans.add(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 3};
        int[] arr1 = {1};
        System.out.println(majorityElement(arr1));
    }
}
