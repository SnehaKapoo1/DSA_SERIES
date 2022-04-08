package striver_sheet.array1.maximumsumsubarray;

public class Naive {
    static int maxSubSum(int[] arr){
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int curr = 0;
            for(int j = i; j<n; j++){
                curr +=arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-5, 1, -2, 3, -1, 2, -2};
        System.out.println(maxSubSum(arr));
    }
}
