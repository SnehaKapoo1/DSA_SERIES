package striver_sheet.array3.majority_ndiv2;

public class MooreAlgo {
    public static int majorityElement(int[] nums) {
        int res =0;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[res] == nums[i])
                count++;
            else
                count--;

            if(count == 0){
                res = i;
                count = 1;
            }
        }

        count =0;
        for(int j = 0; j<nums.length; j++){
            if(nums[res] == nums[j])
                count++;
        }
        if(count > nums.length/2)
            return nums[res];
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 3,3,3};
        int[] arr1 = {1};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr1));
    }
}
