package sorting;

import java.util.Arrays;

public class MergeSort_InPlace {

    static void mergeSort(int arr[], int start, int end){
        if(end - start == 1){
            return;
        }

        int mid =(start + end)/2;

       mergeSort(arr, start, mid);
       mergeSort(arr, mid, end);

       merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int mix[]= new int[e - s];

        int i =s;
        int j=m;
        int k =0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int r=0; r< mix.length; r++) arr[s + r] = mix[r];
    }

    public static void main(String[] args) {


        int arr[] = {20, 4, 60, 9, 30, 50}; //original array is not being modified
        mergeSort(arr, 0, arr.length-1);
        System.out.printf(Arrays.toString(arr));
    }
}
