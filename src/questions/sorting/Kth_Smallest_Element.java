package questions.sorting;

import java.util.Arrays;

public class Kth_Smallest_Element {

	public static void main(String[] args) {
		int a[] = new int[] {10,5,30,12};
		int k = 2;
		
		/* NAIVE APPROACH 
		 * TC : O(NLOGN)
		 * SC : O(1)
		 */
//		Arrays.sort(a);
//		System.out.println(a[k-1]);
		
		//********Optimize Solution***********//
		// TC : O(N^2)
		int index = kthElement(a,k);
		System.out.println(a[index]);
	}
	
	static int l_Partition(int []a, int l, int h) {
		int p = a[h];
		int i=l-1; 
		for(int j=l; j<h; j++) {
			if(a[j] < p) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[h];
		a[h] = temp;
		
		return i+1;
	}
    
	static int kthElement(int a[], int k) {
		int l=0, h = a.length-1;
		while(l <= h) {
			int p = l_Partition(a, l, h);
			if(p == k-1) return p;
			else if(p > k-1) h = p-1;
			else l = p+1;
		}
		return -1;	
	}
}
