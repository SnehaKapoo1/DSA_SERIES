package algorithms.greedy;

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long b = sc.nextLong();

        int n = sc.nextInt();
        long res=0;
        for(int i=0; i<n; i++){
            long L = sc.nextLong();
            long B = sc.nextLong();

            res+= Math.max(((L/l)*(B/b)), ((L/b)*(B/l)));

        }
        System.out.println(res);
    }
}
