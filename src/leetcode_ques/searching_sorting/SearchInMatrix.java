package leetcode_ques.searching_sorting;

import java.util.Arrays;

public class SearchInMatrix {
    static boolean findTargetOptimize(int[][] nums, int target){
        int r =0;
        int c = nums[0].length-1;

        while(r < nums.length && c >=0){
            if(nums[r][c] == target)
                return true;

            else if(nums[r][c] < target)
                r++;
            else
                c--;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]nums ={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50, 70}
        };

        System.out.println((findTargetOptimize(nums, 37)));
    }
}
