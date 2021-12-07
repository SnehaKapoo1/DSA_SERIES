package Recursion.SimpleRecur;

public class CountZeros {
    static int count(int n, int count0){
        if(n== 0){
            return count0;
        }
        int rem = n % 10;
        if(rem == 0){
            return count(n/10, count0+1);
        }
            return count(n / 10, count0);
    }
    public static void main(String[] args){
          System.out.println(count(100000, 0));
    }
}
