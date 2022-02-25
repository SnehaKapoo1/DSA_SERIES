package questions;

import java.util.Scanner;
 class Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int TSP, WD, WN;
        TSP = sc.nextInt();
        WN =(TSP-800)/130;
        WD = WN + 10;
        System.out.println(WD);
        System.out.println(WN);
    }
}
