package questions.sorting;

import java.util.Arrays;

public class SubArrayInversionsEfficientSol {

	public static void main(String[] args) {
		int a[] = {12,3,14,8,15,1,4,22};
		int n= a.length;
		int k=4;
		Solution ob=new Solution();
        long result = ob.inversion_count(n, k, a);
        System.out.println(result);
	}
}
class Solution {
	 
    static long merge(int[] a, int l ,int mid, int r){
        int[] L = Arrays.copyOfRange(a,l,mid+1);
        int[] R = Arrays.copyOfRange(a,mid+1,r+1);
        
        int m = L.length, n = R.length;
        int i = 0, j = 0, k = l;
        
        long swaps = 0;
        
        while(i<m&&j<n){
            if(L[i]<=R[j]){
                a[k++] = L[i++];
            }
            else{
                a[k++] = R[j++];
                swaps += mid+1-l-i;
            }
        }
        
        while(i<m){
            a[k++] = L[i++];
        }
        
        while(j<n){
            a[k++] = R[j++];
        }
        
        return swaps;
    }
 
    static long mergeSort(int[] a, int l, int r){
        if(l>=r)
            return 0;
            
        int mid = (l+r)/2;
        return mergeSort(a,l,mid)+mergeSort(a,mid+1,r)+merge(a,l,mid,r);
    }
 
    static long inversion_count(int N, int K, int a[])
    {
        // Your code goes here
        long sum = 0;
        
        for(int i=0;i<N-K+1;i++){
            sum += mergeSort(Arrays.copyOfRange(a,i,i+K),0,K-1);
        }
        
        return sum;
    }
}
