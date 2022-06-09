package recursion.backtracking.maze;

public class CountPaths_FPP {
    static int countPaths(int i, int j, int m, int n){
        if(i == m-1 || j == n-1){
            return 1;
        }
        return countPaths(i, j+1, m, n) + countPaths(i+1, j, m, n);
    }

    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 3 , 3));
    }
}
