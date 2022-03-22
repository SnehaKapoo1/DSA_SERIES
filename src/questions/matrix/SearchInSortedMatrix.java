package questions.matrix;

import java.util.Arrays;

public class SearchInSortedMatrix {

    //if matrix size is (n * n)
    static int[] findTargetOptimize(int[][] nums, int target){
        int r =0;
        int c = nums.length-1;

        while(r < nums.length && c >=0){
            if(nums[r][c] == target)
                return new int[]{r, c};

            else if(nums[r][c] < target)
                r++;
            else
                c--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int [][]nums ={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(findTargetOptimize(nums, 37)));
    }
}
    /*public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m*n-1;

        while(left<=right){
            int mid = (left + right)/2;
            int midElement = matrix[mid/n][mid%n];
            if(midElement == target) return true;
            else if(target < midElement) right = mid-1;
            else if(target > midElement) left = mid +1;
        }
        return false;
    }*/