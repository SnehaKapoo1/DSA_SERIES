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

    public  static boolean isPalindromeEfficient(Node head){
        // find middle
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid_next = reverseList(slow.next);
        Node curr = head;
        while (mid_next != null){
            if(curr.data != mid_next.data)
                return false;

            mid_next = mid_next.next;
            curr = curr.next;
        }
        return true;
    }

    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
        System.out.println(isPalindromeEfficient(head));
    }
}
