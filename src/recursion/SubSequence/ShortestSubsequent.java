package recursion.SubSequence;

import java.util.Scanner;

public class ShortestSubsequent {

    static boolean isSortedInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    static boolean isSortedInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                return false;
        }
        return true;
    }

    static int main(int arr[]){
        if(isSortedInAscendingOrder(arr) == true || isSortedInDescendingOrder(arr) == true){
            return 0;
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(main(nums));
    }
}
