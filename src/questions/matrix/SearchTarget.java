package questions.matrix;

import java.util.Arrays;

public class SearchTarget {
    static int[] findTargetBruteForce(int[][] matrix, int target){

        for(int r=0; r<matrix.length; r++){
            for(int c =0; c < matrix.length; c++){
                if(matrix[r][c] == target){
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[][] = {
                {18, 9, 12},
                {36, -4, 14},
                {44, 33, 24}
        };

        System.out.println(Arrays.toString(findTargetBruteForce(nums, 14)));
    }
}
