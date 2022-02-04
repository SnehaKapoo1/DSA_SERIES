package leetcode_ques.searching_sorting;

public class TrappingRainWater {
    public static int trapBrute(int[] height) {

        int res =0;

        for(int i=1; i < height.length-1; i++){
            int lmax = height[i];

            for(int j=0; j < i; j++){
                lmax = Math.max(lmax, height[j]);
            }

            int rmax = height[i];
            for(int j = i+1; j < height.length; j++){
                rmax = Math.max(rmax, height[j]);
            }

            res +=Math.min(lmax, rmax)-height[i];
        }
        return res;
    }

    public static int trapEff(int[] nums){
        int res =0;
        int n = nums.length;
        int lmax[]= new int[n];
        int rmax[] = new int[n];

        lmax[0] = nums[0];
        for(int i=1; i< n; i++){
            lmax[i] = Math.max(lmax[i-1], nums[i]);
        }

        rmax[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1], nums[i]);
        }

        for (int i=1; i<n-1; i++){
            res = res + (Math.min(lmax[i], rmax[i])) -nums[i];
        }

        return res;
    }

    public static int trapMoreEff(int height[]){
        int left = 0, right = height.length - 1;
        int result = 0;
        int leftMax = 0, rightMax = 0;
        while(left <= right) {
            if(height[left] <= height[right]) {
                if(height[left] > leftMax)
                    leftMax = height[left];
                else
                    result += leftMax - height[left];
                left++;
            } else {
                if(height[right] > rightMax)
                    rightMax = height[right];
                else
                    result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {5, 0, 6, 2, 3};
        System.out.println(trapMoreEff(arr));
    }
}
