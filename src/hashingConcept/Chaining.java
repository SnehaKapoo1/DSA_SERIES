package hashingConcept;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {

    //size of my hash table
    int Bucket;
    ArrayList<LinkedList<Integer>> table;

    Chaining(int bucket) {

        Bucket = bucket;

        table = new ArrayList<>();

        for (int i = 0; i < bucket; i++) {
            table.add(new LinkedList<>());
        }

    }

    void insert(int key) {
        int i = key % Bucket;
        table.get(i).add(key);
    }

    void remove(int key) {
        int i = key % Bucket;
        table.get(i).remove((Integer) key);
    }

    boolean search(int key) {
        int j = key % Bucket;
        return table.get(j).contains(key);
    }

    public static void main(String[] args) {
        Chaining chaining = new Chaining(7);
        chaining.insert(70);
        chaining.insert(71);
        chaining.insert(9);
        chaining.insert(56);
        chaining.insert(72);

        System.out.println(chaining.search(71));
        chaining.remove(71);
        System.out.println(chaining.search(71));
        System.out.println(chaining.search(73));


    }
}
   /* LinkedList<Integer> llist = new LinkedList<>();

    int arr[] = {50, 21, 58, 17, 15, 49, 56, 22, 23, 25};

    int hashFunction = arr[0] % 7;


        for(int i=1; i< arr.length; i++){
        hashFunction = arr[i] % 7;

        }*/