package questions.sorting;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int a[] = {3,5,10,10,10,15,15,20};
		int n = a.length;
		int b[] = {5,10,10,15,30};
		int m = b.length;
		
		/*********** NAIVE SOLUTION  *********/
		/*********** TC: O(N^2) & SC: O(1) ********/
/**		for(int i=0; i<n; i++) {
			if(i>0 && a[i] == a[i-1]) {
				continue;
			}
			for(int j=0; j<m; j++) {
				if(a[i] == b[j]) {
					System.out.print(b[j] + " ");
					break;
				}
			}
		} **/
		
	/*********** Efficient Solution **********/
    /*********** TC: O(N) & SC: O(N) ********/
		
/**		int a[] = {1,20,20,40,60};
		int n = a.length;
		int b[] = {2,20,20,20};
		int m = b.length;
		
	  Set<Integer> setA = new HashSet<Integer>();
	  for(int element: a)
		  setA.add(element);
	  for(int i=0; i<m; i++) {
		  if(i>0 && b[i] == b[i-1]) {
			  continue;
		  }
		  else if(setA.contains(b[i])) {
			  System.out.print(b[i]+ " ");
		  }
	  } **/
		
		/*********** Most Efficient Solution **********/
	    /*********** TC: O(N) & SC: O(1) ********/
		
//		int a[] = {1,20,20,40,60};
//		int n = a.length;
//		int b[] = {2,20,20,20};
//		int m = b.length;
		int i=0, j=0;
		while(i<n && j<m) {
			if(i>0 && a[i] == a[i-1]) {
				i++; continue;
			}
			else {
				if(a[i] < b[j]) i++;
				else if(a[i] > b[j]) j++;
				else {
					System.out.print(a[i] + " ");
					i++; j++;
				}
			}
		}

	}

}
