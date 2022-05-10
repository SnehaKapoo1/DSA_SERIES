package worktech.arrays;

import java.util.ArrayList;
import java.util.List;

public class PositiveCumulativeSum {
    static List<Integer> getPositiveCumulativeSum (int[] arr) {
        // add your logic here
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < arr.length; i++){
            int sum = 0;
            for(int j=0; j<=i; j++){
                sum +=arr[j];
            }
            if(sum > 0){
                list.add(sum);
            }
        }
        return list;
    }

    List<Integer> getPositiveCumulativeSumEfficient (int[] arr) {
        // add your logic here
        List<Integer> list = new ArrayList<>();

        int[] ans = new int[arr.length];
        ans[0] = arr[0];

        for(int i=1; i < arr.length; i++){
            ans[i] = ans[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            if(ans[i] > 0){
                list.add(ans[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -6};
        System.out.println(getPositiveCumulativeSum(arr));
    }
}
