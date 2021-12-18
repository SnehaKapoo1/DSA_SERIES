package questions.sorting;

import java.util.Arrays;
import java.util.*;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		
		/*********** NAIVE SOLUTION  *********/
		/*********** TC: O(nLogn) & SC: O(n) ********/
		
		int a[] = {3,5,8};
		int n = a.length;
		int b[] = {5,10,10,15,30};
		int m = b.length;
		
/**		int[] c=new int[m+n];
        for(int i=0;i<n;i++)
            c[i]=a[i];
        for(int i=0;i<m;i++)
            c[n+i]=b[i];
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++){
            if(i==0 ||c[i]!=c[i-1])
                System.out.print(c[i]+" ");
        } 
**/
	
/**		SortedSet<Integer> set = new TreeSet<>();
		for(int element: a) set.add(element);
		for(int element: b) set.add(element);
		System.out.print(set + " ");
**/
		int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i-1]==a[i]){i++;continue;}
            if(j>0 && b[j-1]==b[j]){j++;continue;}
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            else{System.out.print(a[i]+" ");i++;j++;}
        }
            while(i<n){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
            while(j<m){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;       }

	}

}
