package oops.Inheritance.singleInheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        BoxWeight bw = new BoxWeight();
        BoxWeight bw2 = new BoxWeight(bw);

    }
}
