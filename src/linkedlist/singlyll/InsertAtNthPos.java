package linkedlist.singlyll;

import linkedlist.singlyll.Node;

import static linkedlist.singlyll.Traversal.printList;

public class InsertAtNthPos {

    public static Node insertNPos(Node head, int item, int pos){
        Node temp = new Node(item);
        if(pos == 1){
            temp.next = head;
            return head;
        }
        Node curr = head;
        for(int i=1; i < pos - 1 &&  curr!=null; i++){
            curr = curr.next;
        }

        if(curr == null)
            return head;

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);

        System.out.println();

        insertNPos(head, 25, 3);
        printList(head);
    }
}
