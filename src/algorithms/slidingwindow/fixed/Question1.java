package algorithms.slidingwindow.fixed;

public class Question1 {

    static int bruteForceApproach(int arr[], int k){

        int res =0;
        for(int i=0; i< arr.length -k + 1; i++){
            int currSum =0;
            for(int j =0; j < k; j++){
                currSum +=arr[j+i];

               res = Math.max(currSum, res);
            }
        }
        return res;
    }

    static int slidingWindowApp(int arr[], int k){

        int start =0;
        int max_sum =0;
        for(start = 0; start<k; start++){
            max_sum +=arr[start];
        }

       int window_sum =max_sum;
        for( int end = k; end < arr.length; end++){
            window_sum += arr[end] - arr[end - k];
            max_sum = Math.max(max_sum, window_sum);

        }
        return max_sum;
    }

    static int slidingWindowAdityaVermaApproach(int arr[], int window_size){
        int start =0;
        int end =0;
        int sum =0;
        int max = Integer.MIN_VALUE;
        int size = arr.length;

        while(end < size){
            sum +=arr[end];

            if((end - start + 1) < window_size)
                end++;

            else if((end - start + 1) == window_size){
                max = Math.max(sum, max);
                sum = sum - arr[start];
                start++;
                end++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 2, 9, 1};
        int k =3;
        System.out.println(bruteForceApproach(arr, k));
        System.out.println(slidingWindowApp(arr, k));
        System.out.println(slidingWindowAdityaVermaApproach(arr, k));
    }
}
