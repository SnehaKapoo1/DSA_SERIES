package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {

   static class Stack{
       static Queue<Integer> q1 = new ArrayDeque<>();
       static Queue<Integer> q2 = new ArrayDeque<>();

       static int size;
       Stack(){
           size =0;
       }

       static void push(int x)
       {
           size++;
           while (!q1.isEmpty()) {
               q2.add(q1.peek());
               q1.remove();
           }

           q1.add(x);
           while(!q2.isEmpty()) {
               q1.add(q2.peek());
               q2.remove();
           }
       }
   }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println();
    }
}
