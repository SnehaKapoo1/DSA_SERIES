package algorithms.prefixsum;


import java.util.Arrays;

public class Prefix_Sum {

    static int[] prefMeth(int arr[]){
        int[] res = new int[arr.length];

        res[0] = arr[0];
        for(int i =1; i< arr.length; i++){
            res[i] = res[i-1] + arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        int[] output = prefMeth(nums);
        //find sum for range [0-6]
       // System.out.println(output[6]);
        //find sum for range [2-6]
        //System.out.println(output[6] - output[1]);
        System.out.println( Arrays.toString(output));
    }
}
