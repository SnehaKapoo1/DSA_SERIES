package questions.stack;

import java.util.Stack;

class MinStack {
    
    Stack<Integer> stack;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x<=min) {
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(min == stack.pop()) {
            min=stack.pop();
        }
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(8);
        minStack.push(2);
        minStack.push(4);

        System.out.println(minStack.stack);

    }
}

