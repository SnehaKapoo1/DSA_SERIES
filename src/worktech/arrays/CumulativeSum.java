package worktech.arrays;

import java.util.Arrays;

public class CumulativeSum {
    static int[] cumulativeSumNaive(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            int sum = 0;
            for(int j=0; j<=i; j++){
                sum +=arr[j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    static int[] cumulativeSumEfficient(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i=1; i < arr.length; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(cumulativeSumNaive(arr)));
        int[] ans = cumulativeSumEfficient(arr);
        System.out.println(Arrays.toString(ans));
    }
}
