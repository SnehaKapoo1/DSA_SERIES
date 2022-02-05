package leetcode_ques.hashing;

import java.util.Arrays;

public class HowManyNumsSmallerThanCurr {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
//         int[] ans = new int[nums.length];

//         for(int i =0; i < nums.length; i++){
//             int count =0;
//             for(int j =0; j < nums.length; j++){
//                 if(nums[i] > nums[j] && i != j){
//                     count++;
//                 }
//             }
//             ans[i] = count;
//         }

//         return ans;

        int bucket[] = new int[102];

        for(int ele : nums){
            bucket[ele]++;
        }

        for(int i=1; i< bucket.length; i++){
            bucket[i] +=bucket[i-1];
        }

        int[] result = new int[nums.length];
        for(int i=0; i< nums.length; i++){

            if(nums[i] == 0)
                result[i] =0;

            else{
                result[i] = bucket[nums[i] -1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
