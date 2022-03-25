package linkedlist.doublyll;

import static linkedlist.doublyll.Creationdll.printlist;

public class ReverseDoublyLL {
    public static Node revereInDoublyLinkedList(Node head){
         if(head == null || head.next == null) return head;
         Node prev = null, curr = head;
         while(curr != null){
             //swapping prev to next, next to prev
             prev = curr.prev;
             curr.prev = curr.next;
             curr.next = prev;

             curr = curr.prev; // moving pointer forward
         }
         return prev.prev;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        printlist(head);
        head = revereInDoublyLinkedList(head);
        System.out.println();
        printlist(head);
    }
}
