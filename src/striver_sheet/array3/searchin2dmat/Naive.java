package striver_sheet.array3.searchin2dmat;

import java.util.Arrays;

public class Naive {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int row=0; row<matrix.length; row++){
            for(int col =0; col < matrix[0].length; col++){
                if(matrix[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] searchMatrixIndexFindingMethod(int[][] matrix, int target) {
        for(int row=0; row<matrix.length; row++){
            for(int col =0; col < matrix[0].length; col++){
                if(matrix[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(searchMatrix(mat, 16));
        System.out.println(Arrays.toString(searchMatrixIndexFindingMethod(mat, 16)));
    }
}
