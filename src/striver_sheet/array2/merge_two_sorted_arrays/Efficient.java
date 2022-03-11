package striver_sheet.array2.merge_two_sorted_arrays;

import java.util.Arrays;

public class Efficient {
   static void merge(int[] arr1, int m, int[] arr2, int n){
       int j;

       for(int i=0; i< arr1.length; i++){
           if(arr1[i] > arr2[0]){
               int temp = arr1[i];
               arr1[i] = arr2[0];
               arr2[0] = temp;
           }

          // Arrays.sort(arr2);

           //reverse array2 code
           int temp = arr2[0];
          for(j =1; j <n && arr2[j] < temp; j++){
              arr2[j -1] = arr2[j];
          }
          arr2[j-1] = temp;
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
        merge(arr1, arr1.length, arr2, arr2.length);

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
