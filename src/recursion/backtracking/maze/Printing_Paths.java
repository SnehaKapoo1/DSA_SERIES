package recursion.backtracking.maze;

public class Printing_Paths {
    public static void main(String[] args) {
        boolean maze[][] =
                {{true, true, true,}, {true, false, true}, {true, true, true}};
        //printPathsDiagonal("", 3, 3);
        printPathsWithRestrictions("", maze, 0, 0);

    }

    static void printPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            printPaths(p + 'D', r - 1, c);
        }
        if (c > 1) {
            printPaths(p + 'R', r, c - 1);
        }
    }

    static void printPathsDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            printPathsDiagonal(p + 'V', r - 1, c); // vertical
        }
        if (c > 1) {
            printPathsDiagonal(p + 'H', r, c - 1);// Horizontal
        }
        if (r > 1 && c > 1) {
            printPathsDiagonal(p + 'D', r - 1, c - 1);// Diagonal
        }
    }

    static void printPathsWithRestrictions(String p, boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            printPathsWithRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            printPathsWithRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
