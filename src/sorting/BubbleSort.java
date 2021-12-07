package sorting;

import java.util.Arrays;

public class BubbleSort {

    static int[] sortAlgo(int arr[]){
        int n = arr.length;
        for(int i =0; i < n-1; i++){
            for(int j =0; j < n-i-1; j++){
                if(arr[j] > arr[ j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else{
                    continue;
                }
            }
        }
        return arr;
    }

    static int[] optimizeSol(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                } else {
                    continue;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {16, 24, 8, 4, 6, 6};
        System.out.println(Arrays.toString(arr));

        /*int sortedArray[] = sortAlgo(arr);
        System.out.println(Arrays.toString(sortedArray));*/

        int optimizeSortedArray[] = optimizeSol(arr);
        System.out.println(Arrays.toString(optimizeSortedArray));
    }


}
