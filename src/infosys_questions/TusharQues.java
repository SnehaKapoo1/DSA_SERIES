package infosys_questions;

import java.util.Scanner;

public class TusharQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String string_number = Integer.toString(n);
        int i, j;
        for (i = 0;i < string_number.length()-1; i++) {
            for(j = string_number.length()-1; j>0;j--) {
                if(string_number.charAt(i) == string_number.charAt(j)){
                    System.out.println("Given number is already a palindrome");
                    System.out.println(n + " is a palindrome");
                }
                else {
                    add(n);
                }
            }
        }
    }
    static int reverse(int n){

        int rev = 0;
        int rem;

        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        return rev;
    }

    static void add(int n) {
        int result = n + reverse(n);
        String string_number = Integer.toString(result);
        int i,j;
        for (i = 0; i < string_number.length()-1; i++) {
            for(j = string_number.length()-1; j>0;j--) {
                if(string_number.charAt(i) == string_number.charAt(j)){
                    System.out.println("Given number is already a palindrome");
                    System.out.println(n + " is a palindrome");
                }
                else {
                    add(result);
                }
            }
        }

    }
}
