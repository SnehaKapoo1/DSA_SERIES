package questions.sorting;

import java.util.Arrays;

public class SubArrayInversionMergeSortApproach {
	
	static int subArrayInversion(int[] arr,int n, int k) {
		int result=0;
		for(int i=0; i<n-k+1; i++) {
			result +=countInv(Arrays.copyOfRange(arr, i, i+k),0,k-1);
		}
		return result;
	}
	
	static int countInv(int arr[], int l, int r) {
		if(l>=r)
            return 0;
            
        int mid = (l+r)/2;
        return countInv(arr,l,mid)+countInv(arr,mid+1,r)+countInvAndMergeSort(arr,l,mid,r);
	}
	static int countInvAndMergeSort(int arr[], int l, int mid, int r) {
		int[] left = Arrays.copyOfRange(arr,l,mid+1);
        int[] right = Arrays.copyOfRange(arr,mid+1,r+1);
        
		int i=0,j=0,count=0,k=l;
		int n1= left.length,n2 = right.length; 
		while(i<n1 && j<n2) {
			if(left[i] < right[j]) {
				arr[k] = left[i]; i++; k++;
			}else {
				arr[k] = right[j]; j++;
				count = count + (n1-i);
				k++;
			}
		}
		while(i<n1) {
			arr[k] = left[i]; i++; k++;
		}
		while(j<n2) {
			arr[k] = right[j]; j++; k++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1,6,7,2};
		int k=3;
		int count = subArrayInversion(arr,arr.length, k);
		System.out.println(count);

	}

}
