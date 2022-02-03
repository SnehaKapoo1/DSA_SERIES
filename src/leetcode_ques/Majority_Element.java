package leetcode_ques;

import java.util.Scanner;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
//         int count = nums.length/2;

//         for(int i =0; i<nums.length; i++){
//             int c =1;

//             for(int j =i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     c++;
//                 }
//             }

//             if(c > count){
//                 return nums[i];
//             }
//         }
//         return -1;

        int count =1;
        int res =0;
        int n =nums.length;
        for(int i=1; i<n; i++){
            if(nums[res] == nums[i])
                count++;
            else
                count--;

            if(count == 0){
                res =i;
                count =1;
            }
        }

        count =0;
        for (int num : nums) {
            if (nums[res] == num)
                count++;
        }
        if(count > n/2)
            return nums[res];

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];

        for(int i=0; i<n; i++) nums[i] = sc.nextInt();

        System.out.println(majorityElement(nums));
    }
}
