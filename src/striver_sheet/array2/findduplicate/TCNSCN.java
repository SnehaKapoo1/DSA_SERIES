package striver_sheet.array2.findduplicate;

import java.util.Arrays;

public class TCNSCN {
    static int findDuplicate(int[] nums, int n){
        int[] fre = new int[n+1];
        for(int i=0; i<n; i++){
            if(fre[nums[i]] == 0)
                fre[nums[i]] +=1;
            else return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3};
        int n = arr.length;
        System.out.println(findDuplicate(arr, n));
    }
}
