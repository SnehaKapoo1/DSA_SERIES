package recursion.backtracking.maze;

public class CountPaths_FPP {
    static int countPaths(int i, int j, int m, int n){
        if(i == m-1 || j == n-1){
            return 1;
        }
        return countPaths(i, j+1, m, n) + countPaths(i+1, j, m, n);
    }

    static int count =0;
    static void countPaths2(int i, int j, int m, int n){
        if(i == m-1 || j == n-1){
            count++;
        }
       else {
            countPaths2(i, j+1, m, n);
            countPaths2(i+1, j, m, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 3 , 3));
        countPaths2(0,0, 3, 3);
        System.out.println(count);
    }
}
