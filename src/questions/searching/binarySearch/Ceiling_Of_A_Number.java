package questions.searching.binarySearch;

public class Ceiling_Of_A_Number {
	
	static int  ceilingMethod(int arr[], int n, int target) {
		
		int start = 0, end =n-1, ans = -1;
		
		while(start <= end) {
			int mid = start +(end - start)/2;
			
			if(arr[mid] == target) return mid;
			
			else if(arr[mid] < target) {
				start = mid +1;
			}
			
			else {
				//ans = mid;
				end = mid -1;
			}	
		}
		//return arr[start];
		return start;
	}

	public static void main(String[] args) {
		//int arr[] = {1, 2, 3 ,8, 10, 12, 15, 18, 20};
		int arr[] = {2, 3, 5, 9, 14, 16, 18};
		int n = arr.length;
		
		System.out.println(ceilingMethod(arr, n, 15));

	}

}
