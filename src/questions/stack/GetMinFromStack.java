package questions.stack;

//Approach 1
//Tc: O(n)
//Sc: O(n)

import java.util.Stack;

public class GetMinFromStack {

     Stack<Integer> valueStack;
     Stack<Integer> minStack;

    GetMinFromStack(){
        valueStack = new Stack<>();
        minStack = new Stack<>();
    }

     void push(int val){
        if(minStack.isEmpty() || val <= getMin()){
            minStack.push(val);
        }
        valueStack.push(val);
    }

     void pop(){
        if(valueStack.isEmpty())
            return;

        if(valueStack.peek() == getMin()){
            minStack.pop();
        }
        valueStack.pop();
    }

     int top(){
        return valueStack.peek();
    }

     int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        GetMinFromStack minFromStack = new GetMinFromStack();
        minFromStack.push(5);
        minFromStack.push(2);
        minFromStack.push(8);

        minFromStack.pop();

        minFromStack.push(3);
        minFromStack.push(6);

        System.out.println(minFromStack.top());
        System.out.println(minFromStack.getMin());
    }
}
