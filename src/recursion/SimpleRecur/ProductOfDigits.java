package recursion.SimpleRecur;

public class ProductOfDigits {
    public static void main(String[] agrs) {
        int ans = prd(2342);
        System.out.println(ans);
    }
    static int prd(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * prd(n / 10);
    }
}
