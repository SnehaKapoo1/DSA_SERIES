package algorithms.kadane;

public class MaxSumSubarray {

    static int findMaxNaive(int arr[], int n){
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

    static int kadaneAlgo(int[] arr, int n){
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i=1; i<n; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -1, 2};
        int n = arr.length;
        System.out.println(findMaxNaive(arr, n));
        System.out.println(kadaneAlgo(arr, n));
    }
}
