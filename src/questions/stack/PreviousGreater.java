package questions.stack;

import java.util.Stack;

public class PreviousGreater {
    public static void prevGreater(int []arr, int n){
        for(int i=0; i<n; i++){
            int j;
            for(j= i-1; j>=0; j--){
                if(arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if(j == -1)
                System.out.print(-1 + " ");
        }
    }

    public static void prevGreaterEfficient(int []arr, int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.print(-1 + " ");
        for(int i=1; i<n; i++){
            while(stack.isEmpty() == false && stack.peek() < arr[i])
                stack.pop();

            int pg = stack.isEmpty()? -1 : stack.peek();
            System.out.print(pg + " ");
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        //int []arr ={30, 20, 25, 28, 27, 29};
        int []arr = {13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
        prevGreater(arr, arr.length);
        System.out.println();
        prevGreaterEfficient(arr, arr.length);
    }
}
