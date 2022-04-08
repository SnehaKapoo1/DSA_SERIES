package linkedlist.doublyll;

import static linkedlist.doublyll.Creationdll.printlist;

public class InsertAtEnd {
    public static Node insertEnd(Node head, int item){
        Node temp = new Node(item);
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;

        return head;
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
        insertEnd(head, 40);
        printlist(head);
    }
}
