package hacker_rank.array_ques;

public class TwoDArrays {
    static int findMax(int arr[][]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<4; i++){
            for(int j=0; j< 4; j++){
                max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][]arr= {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0},
        };

        System.out.println(TwoDArrays.findMax(arr));
    }
}
