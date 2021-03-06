package striver_sheet.array1.setmatrixzero;

//only for non-negative numbers
class BruteForce {
    static void setZeroes(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){

                    int re = Integer.MIN_VALUE;

                    //traversal for upward column element's index
                    int ind = i-1;
                    while(ind >=0){
                        if(matrix[i][ind] !=0){
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }

                    //traversal for downward column element's index
                    ind = i+1;
                    while(ind < rows){
                        if(matrix[i][ind] !=0){
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }

                    //traversal for upward rows element's index
                    ind = j-1;
                    while(ind >=0){
                        if (matrix[i][ind] !=0){
                            matrix[i][ind] =-1;
                        }
                        ind--;
                    }

                    //traversal for downward rows element's index
                    ind = j+1;
                    while (ind < cols){
                        if (matrix[i][ind] !=0){
                            matrix[i][ind] =-1;
                        }
                        ind++;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] <= 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    public static void main(String args[]) {
        int arr[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}