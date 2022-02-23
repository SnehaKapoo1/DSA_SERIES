package algorithms.greedy;

import java.util.Arrays;
class Item implements Comparable<Item>{
    int weight;
    int values;

    Item(int w, int v){
        weight = w;
        values = v;
    }

    @Override
    public int compareTo(Item i) {
        return (weight)*i.values - values * (i.weight);
    }
}
public class FractionalKnapsack {
    public static void main(String[] args) {
        Item[] arr = {
                new Item(10, 200),
                new Item(5, 50),
                new Item(20, 100),
        };
        int capacity=15;
        System.out.println(facknapProb(arr, capacity));
    }

    private static double facknapProb(Item[] arr, int capacity) {
        Arrays.sort(arr);
        double res =0.0;
        int curr_cap = capacity;

        for(int i=0; i< arr.length; i++){
            if(arr[i].weight <= curr_cap){
                curr_cap = curr_cap - arr[i].weight;
                res = res + arr[i].values;
            }else{
                res = res + arr[i].values * ((double)curr_cap/arr[i].weight);
            }
        }
        return res;
    }
}
