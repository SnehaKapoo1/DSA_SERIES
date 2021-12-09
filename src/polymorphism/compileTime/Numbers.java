package polymorphism.compileTime;

public class Numbers {

    int sum(int a, int b){
        return a + b;
    }

    double sum(double a, int b){
        return a + b;
    }

    String sum(int a, String b){
        return a + " " + b;
    }

    String sum(String a, int b){
        return a + " " + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        double ans = obj.sum(4.0, 6);
        String s = obj.sum(1, "Kapoor");
        System.out.println(ans);
        System.out.println(s);
    }
}
