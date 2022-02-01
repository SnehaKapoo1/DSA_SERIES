package infytq;

import java.util.Scanner;

public class Palindrome {
    static int check(int num) {
        int rem, sum = 0, temp;
        temp = num;
        //boolean b =false;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }

        if (temp == sum) {
            return temp;
        }
        return -1;
    }

    public static int reverse(int num) {
        int rem =0;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check");
        int num = sc.nextInt();
        int ans = check(num);
        if(ans != -1){
            System.out.println("Given number is already a palindrome" + "\n" + ans + " " + "is a palindrome");
        }
        else{
           do{
               int temp = num;
               int rev =  reverse(num);
               num = num + rev;
               System.out.println(temp + " + " + rev + " =" +" "+  num);
           }while (num!=reverse(num));
            System.out.println(num + " " + "is a palindrome");
        }
    }
}