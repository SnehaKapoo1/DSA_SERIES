package striver_sheet.array1.sort012;

import java.util.Arrays;

public class Naive {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
