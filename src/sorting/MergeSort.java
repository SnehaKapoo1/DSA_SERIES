package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int arr[] = {20, 4, 60, 9, 30, 50}; //original array is not being modified
        int ans[] =mergeSort(arr);
        System.out.printf(Arrays.toString(arr));
    }

    static int[] mergeSort(int array[]){

        if(array.length == 1){
            return array;
        }

        int mid = array.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(array, 0, mid)); // it is creating new object for every function call
        int right[] = mergeSort(Arrays.copyOfRange(array, mid, array.length)); //it is creating new object for every function call

       return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }

            k++;
        }

        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
