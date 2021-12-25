package questions.easy;

public class DigitsSum {

    int digit, sum=0;

    int meth(int num){
       while (num > 0){
           digit = num % 10;
           sum = sum + digit;
           num = num /10;
       }
       return sum;
    }
    public static void main(String[] args) {
        DigitsSum ds = new DigitsSum();
        System.out.println(ds.meth(123));

    }
}
