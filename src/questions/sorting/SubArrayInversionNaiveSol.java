package questions.sorting;

public class SubArrayInversionNaiveSol { 
	  // Inversion counting method, slides window of [start,
	    // end] across array
	    static int inversion_count(int n, int k, int[] a)
	    {
	        int count = 0;
	        for (int start = 0; start < n - k + 1; start++) {
	            int end = start + k;
	            count += bubble_count(a, start, end);
	        }
	        return count;
	    }
	 
	    // Helper function, counts number of inversions via
	    // bubble sort loop
	    public static int bubble_count(int[] arr, int start, int end)
	    {
	        int count = 0;
	        for (int i = start; i < end; i++) {
	            for (int j = i + 1; j < end; j++) {
	                if (arr[i] > arr[j]) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	 
	    public static void main(String[] args)
	    {
	        int n = 10;
	        int[] arr = { 15, 51, 44, 44, 76, 50, 29, 88, 48, 50 };
	        int k = 5;
	 
	        long result = inversion_count(n, k, arr);
	        System.out.println(result);
	    }
	}