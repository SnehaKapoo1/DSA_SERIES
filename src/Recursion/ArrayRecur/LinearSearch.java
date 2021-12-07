package Recursion.ArrayRecur;

import java.util.ArrayList;

public class LinearSearch {
    static boolean findElement(int arr[], int target, int index){

        if(index  == arr.length){
            return false;
        }
        return arr[index] == target || findElement(arr, target, index+1);
    }

    static int findIndex(int arr[], int target, int index){

        if(index  == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
       return findIndex(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target, int index){

        if(index  == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex2(int arr[], int target, int index, ArrayList<Integer> list ){

        if(index  == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1, list);
    }

    public static void main(String[] args){

        int num[] = {2, 6, 8, 13, 18, 26, 9, 13};
        int find = 13;
        System.out.println(findElement(num, find, 0));
        System.out.println(findIndex(num, find, 0));

        findAllIndex(num, find, 0);
        System.out.println(list);

        System.out.println(findAllIndex2(num, find, 0, new ArrayList<>()));
    }
}
