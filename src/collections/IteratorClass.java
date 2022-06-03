package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        Iterator i = arrayList.iterator();
        System.out.println(i);
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
