package infytq;

class A {
    public int var1;
    public int var2;

    public A(int value) {
        this.var1 = value;
    }

    public int method1() {
        return this.var2;
    }
}

class B extends A {
    public B() {
        super(10);
    }

    public int method1(int value1) {
        return this.var1;
    }
}

class C extends B {

    public C(int value1, int value2) {
        super();
        this.var2 = value2;
    }

    public void method1(int value1, int value2) {
        this.var2 = super.method1(value1);

    }
}

public class Demo {
    public static void main(String[] args) {

        /*double salary = 123467;
        int 1value = 2147483648;
        char gender = "M";
        long bonus = 35000L;
        boolean flag = False;
        String name = 'Alex'*/

        int num1 = 28;
        int num2 = 36;
        int num3 = 0;
        if (~(num2 / num1) < 0 && (num1 + num2) % 4 == 0) {
            num1 = num1 + --num3;
        }
        if ((num2 / num1) > 1 || num3 == 0) {
            num1 = num1 + num3++;
            System.out.println(num1 + --num3);
        } else {
            System.out.println(num1 + --num3);
        }
    }
}