package keywords;

class First{
    First(){
        //this(5);
        System.out.println("Hello I am without parameterize Constructor");
    }

    First(int x){
        this();
        System.out.println("Hello I am parameterize Constructor" + x);
    }

    First(int x, int y){
        this();
        System.out.println("Hello I am parameterize Constructor" + x + " " + y);
    }
}

public class ThiisKeyword3 {
    public static void main(String[] args) {
        First f = new First();
        First f2 = new First(10);
    }
}
