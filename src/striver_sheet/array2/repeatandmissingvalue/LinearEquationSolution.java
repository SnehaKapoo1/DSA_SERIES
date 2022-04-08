package striver_sheet.array2.repeatandmissingvalue;

import java.util.Arrays;

public class LinearEquationSolution {
    static int[] find(int[] arr,int n){
        int[] ans = new int[2];
        long S = (n * (n-1)/2);
        long P =  (n * (n +1) *(2* n +1) )/6;
        int missingNum =0;
        int repeatingNum = 0;

        for(int i=0; i<n; i++){
            S -= (long) arr[i];
            P -= (long) arr[i]*(long) arr[i];
        }
        missingNum = (int) ((S + P/S)/2);
        repeatingNum = (int) (missingNum - S);

        ans[0] = missingNum;
        ans[1] = repeatingNum;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {3, 1, 2, 5, 3};
        //int[] arr = {3,1,2,5,4,6,7,5};
        System.out.println(Arrays.toString(find(arr, arr.length)));
    }
}
