package oops.Inheritance.singleInheritance;

public class BoxWeight extends Box{

    int weight;

    BoxWeight(){
        super();
        System.out.println("BoxWeight without parameterize constructor.....");
        this.weight = 1;
    }

    public BoxWeight(int weight) {
        System.out.println("BoxWeight one parameterize constructor.....");
        this.weight = weight;
    }

    public BoxWeight(int l, int b, int w, int weight) {
        super(l, b, w);
        System.out.println("BoxWeight four parameterize constructor.....");
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        System.out.println("BoxWeight object parameterize constructor.....");
    }
}
