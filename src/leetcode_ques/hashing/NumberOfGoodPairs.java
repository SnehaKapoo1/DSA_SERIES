package leetcode_ques.hashing;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {

//         int count =0;
//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j < nums.length; j++){
//                 if(nums[i] == nums[j])
//                     count++;
//             }
//         }
//         return count;

        int count =0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int ele : nums){
            if(hm.containsKey(ele)){
                hm.put(ele, hm.get(ele)+1);
            }else{
                hm.put(ele, 1);
            }
        }

        for(int ele : hm.values()){
            int sum =0;
            if(ele > 1){
                for(int i =1; i < ele; i++){
                    sum += i;
                }

                count += sum;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
