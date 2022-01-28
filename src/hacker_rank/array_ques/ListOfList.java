package hacker_rank.array_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long max = Integer.MIN_VALUE;
        long arr[] = new long[n + 2];
        //arr[0] = 0;

        for(int i=0; i < queries.size(); i++){
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k = queries.get(i).get(2);

            arr[a] +=k;
            arr[b + 1] -= k;
        }

        for(int i =1; i <= n; i++){
            arr[i] = arr[i-1] + arr[i];
            max = Math.max(max, arr[i]);
        }

        return max;
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);//a
        l1.add(2);//b
        l1.add(100);//k

        list.add(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(5);
        l2.add(100);

        list.add(l2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(4);
        l3.add(100);

        list.add(l3);


        System.out.println(ListOfList.arrayManipulation(5 ,list));


    }
}




