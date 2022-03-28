package linkedlist.circularll;

import static linkedlist.circularll.InsertAtBegin.insertBeginCLLEfficient;
import static linkedlist.circularll.InsertAtBegin.insertBeginCLLNaive;
import static linkedlist.circularll.InsertAtEnd.insertAtEndNaive;
import static linkedlist.circularll.InsertAtEnd.insertEndCLLEfficient;

class Node{
    int data;
    Node next;
    Node(int ele){
        data = ele;
        next = null;
    }
}
public class CreationCLLAndTraversal {
    public static void printList(Node head){
        if(head == null || head.next == head) return;
        System.out.print(head.data + " ");
      Node curr = head.next;
        while(curr != head){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printList(head);

        /*System.out.println();
        head = insertBeginCLLNaive(head, 5);
        printList(head);

        System.out.println();
        head = insertBeginCLLEfficient(head, 2);
        printList(head);*/

        System.out.println();
        head = insertAtEndNaive(head, 50);
        printList(head);

        System.out.println();
        head = insertEndCLLEfficient(head, 60);
        printList(head);

    }
}
