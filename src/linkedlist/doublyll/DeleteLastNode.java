package linkedlist.doublyll;

import static linkedlist.doublyll.Creationdll.printlist;

public class DeleteLastNode {
    public static Node deleteLastNode(Node head){
        if(head == null || head.next == null) return null;
       Node curr = head;
       //first reach till the last node
       while(curr.next!=null){
           curr = curr.next;
       }
       // put last node's previous next's = null
       curr.prev.next=null;
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
        head = deleteLastNode(head);
        System.out.println();
        printlist(head);
    }
}
