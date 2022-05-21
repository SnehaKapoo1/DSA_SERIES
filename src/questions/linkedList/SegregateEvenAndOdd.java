package questions.linkedList;

import static questions.linkedList.Reverse.printList;
import static questions.linkedList.SegregateOddAndEven.arrangeOddAndEven;

public class SegregateEvenAndOdd {
    public static Node meth(Node head){
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        printList(head);
        head = meth(head);
        System.out.println();
        printList(head);
        System.out.println();
        Node h= arrangeOddAndEven(head);
        printList(h);
    }
}
