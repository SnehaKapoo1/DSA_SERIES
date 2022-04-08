package striver_sheet.array2.rotate_matrix;

import java.util.Arrays;

public class Naive {

    static int[][] rotateMat(int[][] mat){
        int[][] ans = new int[mat.length][mat[0].length];

        int n = mat.length;
        int m = mat[0].length;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                ans[j][n-i-1]= mat[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rotated[][] = rotateMat(mat);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
