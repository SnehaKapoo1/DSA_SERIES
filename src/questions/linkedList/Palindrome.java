package questions.linkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {
    public static boolean isPalindrome(Node head) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(Node curr = head; curr !=  null; curr = curr.next){
            stack.push(curr.data);
        }

        for(Node curr = head; curr !=  null; curr = curr.next){
            if(stack.pop() != curr.data){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}
