package algorithms.slidingwindow;

public class Question1 {

    static int find(int arr[], int k){

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

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 2, 9, 7, 1};
        int k =3;
        System.out.println(find(arr, k));
    }
}
