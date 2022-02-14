package algorithms.slidingwindow.fixed;
import java.util.LinkedList;


public class Question2 {

    static void bruteForce(int nums[], int k){

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

        LinkedList<Integer> Di = new LinkedList<>();

        int i;
        for (i = 0; i < k; i++)

            if (arr[i] < 0)
                Di.add(i);

        for ( ; i < n; i++)
        {
            if (!Di.isEmpty())
                System.out.print(arr[Di.peek()] + " ");
            else
                System.out.print("0" + " ");

            while ((!Di.isEmpty()) && Di.peek() < (i - k + 1))
                Di.remove();

            if (arr[i] < 0)
                Di.add(i);
        }

        if (!Di.isEmpty())
            System.out.print(arr[Di.peek()] + " ");
        else
            System.out.print("0" + " ");
    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k =3;

       bruteForce(arr, k);
        System.out.println();
       slidingWindow(arr, k);
    }
}
