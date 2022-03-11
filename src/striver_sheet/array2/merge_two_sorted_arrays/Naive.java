package striver_sheet.array2.merge_two_sorted_arrays;

import java.util.Arrays;

public class Naive {
    static void merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int ind =0;
        for(int i=0; i<arr1.length; i++){
            arr3[ind++] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            if(ind < arr3.length)
               arr3[ind++] = arr2[i];
        }
        Arrays.sort(arr3);

        ind =0;
        for(int i=0; i<arr1.length; i++){
            arr1[i] = arr3[ind++];
        }

        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr3[ind++];
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};

        System.out.println("Before merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        merge(arr1, arr2);
        System.out.println("After merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
