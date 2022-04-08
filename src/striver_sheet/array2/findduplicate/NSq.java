package striver_sheet.array2.findduplicate;

import java.util.Arrays;

public class NSq {
    static int findDuplicate(int[] nums, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j])
                    return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3};
        int n = arr.length;
        System.out.println(findDuplicate(arr, n));
    }
}
