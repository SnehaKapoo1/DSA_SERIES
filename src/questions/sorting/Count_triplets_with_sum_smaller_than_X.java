package questions.sorting;

import java.util.Arrays;

public class Count_triplets_with_sum_smaller_than_X {
	static int countTriplets(int arr[], int n,int sum)
    {
        int count=0;
       Arrays.sort(arr);
       for(int i=0; i<n-2; i++){
           int j=i+1;
           int k=n-1;
           while(j <= k){
               
               if(arr[i] + arr[j] + arr[k] >= sum) k--;
               else {
            	   count +=(k-j);
            	   j++;
               }
               
           }
       }
       return count;
    }

	public static void main(String[] args) {
		int arr[] = {5, 1, 3, 4, 7};
		System.out.println(countTriplets(arr, arr.length,12));
		
	}

}
