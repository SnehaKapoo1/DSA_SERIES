package algorithms.slidingwindow.fixed;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Question2 {

    static void bruteForce(int[] nums, int k){

        boolean flag;

        for(int i=0; i< nums.length-k+1; i++){
            flag = false;
            for (int j=0; j<k; j++){
                if(nums[i+j] <0){
                    System.out.print(nums[i+j] + " ");
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.print(0 + " ");
        }
    }

    static void slidingWindow(int[] arr, int k){
        int n = arr.length;
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(j < n){
            if(arr[j] < 0)
                list.add(arr[j]);

            if(j-i+1 < k)
                j++;

            else if(j-i+1 == k){
                if(list.isEmpty()) {
                    System.out.print(0 + " ");
                    i++;
                }
                else{
                    System.out.print(list.get(0) + " ");
                    if (arr[i] == list.get(0))
                        list.remove(list.get(0));
                    i++;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k =3;

       bruteForce(arr, k);
        System.out.println();
       slidingWindow(arr, k);
    }
}
