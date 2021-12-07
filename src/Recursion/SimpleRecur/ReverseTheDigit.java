package Recursion.SimpleRecur;

public class ReverseTheDigit {
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10 + " ");
        rev1(n / 10);
    }

    static int sum =0;
    static void rev2(int n) {
        if (n==0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev2(n / 10);
    }

    static int rev3(int n){
        int digit = (int)(Math.log10(n) + 1);
        return helper(n, digit);
    }

     static int helper(int n, int digit) {
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digit-1) + helper(n/10, digit - 1));
    }

    public static void main(String[] agrs) {
       /* rev1(12345);

        System.out.println();
        System.out.println((int)(Math.log10(123456)) + 1); // It gives us total number of digits like 57889 = 5*/

        /*rev2(12345);
        System.out.println(sum);*/

        System.out.println(rev3(57689));
    }
}
