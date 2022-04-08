package striver_sheet.array2.merge_two_sorted_arrays;

import java.util.Arrays;

public class Naive2 {
    static void merge(int[] arr1, int[] arr2, int n, int m){
        for(int i=m; i<m+n; i++){
            arr1[i] = arr2[i-m];
        }
        Arrays.sort(arr1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
    }
}
