package questions.searching;

import java.io.*;
import java.util.*;
class AllocateMinPagesEffSol {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
// } Driver Code Ends
class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m)
    {
        long sum = 0;
        if(n < m) return -1;
    
        for(int i = 0; i < n; ++i) 
            sum += a[i];
    
    
        long start = 0;
        long end = sum, mid = 0;
        int ans = Integer.MAX_VALUE;
    
        while(start <= end) 
        {
        
            mid = (start + end) / 2;
        
            if (isFeasible(a, n, m, (int)mid)) {
            
                ans = Math.min(ans, (int)mid);
                end = mid - 1;
            }
        
            else {
            start = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isFeasible(int arr[], int n, int k, int curMin){
        int studentsRequired = 1;
          int curSum = 0;
    
        for (int i = 0; i < n; i++) {
        
            if (arr[i] > curMin) return false;
        
            if (curSum + arr[i] > curMin) {
            
                studentsRequired++;
                curSum = arr[i];
                if (studentsRequired > k) return false;
            }
        else {
            curSum += arr[i];
        }
    }
        return true;
    }
}