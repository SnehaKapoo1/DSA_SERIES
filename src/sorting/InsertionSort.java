package sorting;

import java.util.Arrays;

public class InsertionSort {
    static int[] sort(int arr[]){
      int i,j,key;
      for(i=0; i< arr.length; i++){
          key = arr[i];
          j = i-1;
          while(j>=0 && arr[j] > key){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1] = key;
      }
      return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 60, 80, 20, 45, 15};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
