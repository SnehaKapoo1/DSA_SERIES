package recursion.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {

       /* int arr[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = subset(arr);
        for (List<Integer> list:  ans){
            System.out.println(list);
        }*/

        int arr[] = {1, 2, 2};
        ArrayList<ArrayList<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list:  ans){
            System.out.println(list);
        }
    }

    static ArrayList<ArrayList<Integer>> subset(int arr[]){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());

        for(int num: arr){
            int n = outer.size();
            for (int i=0; i<n; i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static ArrayList<ArrayList<Integer>> subsetDuplicate(int arr[]){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start =0;
        int end =0;

        for(int j =0; j< arr.length; j++){
            start =0;
            if(j>0 && arr[j] == arr[j-1]){
                start = end + 1;
            }
            end = outer.size() -1;
            int n = outer.size();

            for (int i=start; i<n; i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
