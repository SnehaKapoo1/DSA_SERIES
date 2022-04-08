package striver_sheet.array1.sort012;

import java.util.Arrays;

public class ThreeVariableApproach {

    static void sort(int[] nums) {
        int z =0;
        int o=0;
        int t=0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0) z++;
            else if(nums[i] == 1) o++;
        }

        int j =0;
        while(j < z){
            nums[j++] = 0;
        }
        while(j < z+o){
            nums[j++] = 1;
        }
        while(j < nums.length){
            nums[j++] = 2;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
