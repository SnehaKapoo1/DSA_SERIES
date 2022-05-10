package questions.stack;

import java.util.Stack;

public class StockSpan {
    public static void stockSpan(int []arr){
        for(int i=0; i< arr.length; i++){
            int span =1;

            for(int j=i-1; j >=0; j--){
                if(arr[j] <= arr[i])
                    span++;
                else if(arr[j] > arr[i])
                    break;
            }
            System.out.print(span + " ");
        }
    }

    public static void stockSpanEfficient(int []arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.print(1 + " ");

        for(int i = 1; i< arr.length; i++){
            while(stack.isEmpty() == false && arr[stack.peek()] < arr[i])
                stack.pop();

            int span = stack.isEmpty()? i+1 : i - stack.peek();
            System.out.print(span + " ");
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        //int []arr ={30, 20, 25, 28, 27, 29};
        int []arr = {13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
        stockSpan(arr);
        System.out.println();
        stockSpanEfficient(arr);
    }
}
