package striver_sheet.array4.twosum;

import java.util.Arrays;

public class Naive {
    public static int[] twoSum(int[] arr, int target){
        int[] ans = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
