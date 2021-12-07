package sorting;

import java.util.Arrays;

public class SelectionSort {

    static int[] basicAlgo(int arr[]){
        int temp[] = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            int min_index =0;
            for(int j=1; j< arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            temp[i] = arr[min_index];
            arr[min_index] = Integer.MAX_VALUE;
        }
        for(int i=0; i< arr.length; i++){
            arr[i] = temp[i];
        }
        return arr;
    }

    static int[] optimizeSol(int arr[]){
        for(int i=0; i< arr.length; i++){
            int max_index=i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[max_index]){
                    max_index = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[max_index];
            arr[max_index]= temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int num[] = {10, 5, 8, 20, 2, 18};
        System.out.println(Arrays.toString(num));

        basicAlgo(num);
        System.out.println(Arrays.toString(num));

        optimizeSol(num);
        System.out.println(Arrays.toString(num));
    }
}
