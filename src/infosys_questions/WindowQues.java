package infosys_questions;

import java.util.Scanner;

public class WindowQues {

    static void windowMin(int a[], int s)
    {
        for (int k = 1; k <= s; k++) {
            int maxmin = Integer.MIN_VALUE;

            for (int i = 0; i <= s - k; i++) {
                int min = a[i];
                for (int j = 1; j < k; j++) {
                    if (a[i + j] < min)
                        min = a[i + j];
                }

                if (min > maxmin)
                    maxmin = min;
            }
            System.out.print(maxmin + " ");
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        //int num[] = new int[7];
        int num [] = { 30, 20, 10};
        /*for(int i=0; i<7; i++){
            num[i] = sc.nextInt();
        }*/
        windowMin(num, 3);
    }
}
