package infytq;

public class Palindrome {
    static boolean check(int num){
        int rem, sum = 0, temp;
        temp = num;
        //boolean b =false;
        while(num > 0){
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /=10;
        }

        if(temp == sum){
            return true;
        }
        return false;
    }

    static boolean check2(int num){
        int rem, sum = 0, temp;
        temp = num;
        //boolean b =false;
        while(num > 0){
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /=10;
        }

        if(temp == sum){
            return true;
        }else{
            check2(temp + sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 1421;

        if(check(num)){
            System.out.println("Given number is already a palindrome" + "\n" + num + " " + "is a palindrome");
        }else if(check2(num)){
            System.out.println(num + " " + "is a palindrome");
        }else{
            System.out.println(num + " " + "is not a palindrome");
        }
    }
}
