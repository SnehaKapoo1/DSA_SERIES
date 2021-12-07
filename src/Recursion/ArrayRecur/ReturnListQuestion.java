package Recursion.ArrayRecur;

import java.util.ArrayList;
import java.util.Collections;

public class ReturnListQuestion {
    static ArrayList<Integer> findAllIndex2(int arr[], int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index  == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add((index));
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args){

        int num[] = {2, 6, 3, 3, 8};
        int find = 3;

        System.out.println(findAllIndex2(num, find, 0));
    }
}
