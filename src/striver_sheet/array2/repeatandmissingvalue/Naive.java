package striver_sheet.array2.repeatandmissingvalue;

import java.util.Arrays;

public class Naive {
    static int[] find(int[] arr,int n){
        int[] freq = new int[n+1];
        Arrays.fill(freq, 0);
        int[] ans = new int[2];
        for(int i=0; i< n; i++){
            if(freq[arr[i]] >= 0)
                freq[arr[i]] +=1;
        }

        for(int i=0; i< freq.length; i++){
            if(freq[i] > 1){
                ans[0] = i;
            }
        }

        for(int i=1; i< freq.length; i++){
            if(freq[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {3, 1, 2, 5, 3};
        //int[] arr = {3,1,2,5,4,6,7,5};
        System.out.println(Arrays.toString(find(arr, arr.length)));
    }
}
