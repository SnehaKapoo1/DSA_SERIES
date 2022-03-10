package striver_sheet.array1.sort012;

public class PointerApproach {
    static void sort(int[] nums){
        int low =0;
        int mid =0;
        int high =nums.length-1;

        int temp;
       while(mid <= high){
           switch (nums[mid]) {
               case 0: {
                   temp = nums[low];
                   nums[low] = nums[mid];
                   nums[mid] = temp;
                   low++;
                   mid++;
                   break;
               }
               case 1:
                   mid++;
                   break;
               case 2: {
                   temp = nums[mid];
                   nums[mid] = nums[high];
                   nums[high] = temp;
                   high--;
                   break;
               }
           }
       }
    }

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
