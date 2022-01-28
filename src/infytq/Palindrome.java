package infytq;

public class Palindrome {
    static boolean check(int num) {
        int rem, sum = 0, temp;
        temp = num;
        //boolean b =false;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }

        if (temp == sum) {
            return true;
        }
        return false;
    }

    public static void check2(int num) {
        int rem, sum = 0, temp;
        temp = num;
        //boolean b =false;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }

        if (temp == sum) {
            System.out.println(temp + " " + "is a palindrome");
        } else {
            check2(temp + sum);
        }
    }

    public static void main(String[] args) {
        int num = 121;

    }
}
