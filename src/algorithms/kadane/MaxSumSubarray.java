package algorithms.kadane;

public class MaxSumSubarray {

    static int findMax(int arr[], int n){
        int max =arr[0];

        for(int i=0; i<n; i++){
            int curr = 0;
            for(int j =i; j<n; j++){
                curr +=arr[j];
                max = Math.max(curr, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -1, 2};
        int n = arr.length;
        System.out.println(findMax(arr, n));
    }
}
