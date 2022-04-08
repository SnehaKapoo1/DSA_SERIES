package striver_sheet.array2.findduplicate;

import java.util.Arrays;

public class NlogNApproach {
    static int findDuplicate(int[] nums, int n){
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1])
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3};
        int n = arr.length;
        System.out.println(findDuplicate(arr, n));
    }
}
