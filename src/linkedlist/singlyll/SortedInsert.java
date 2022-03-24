package linkedlist.singlyll;

import static linkedlist.singlyll.Traversal.printList;

public class SortedInsert {
    public static Node sortedInsert(Node head, int item){
        Node temp = new Node(item);
        if(head == null)
            return temp;
        if(item < head.data){
            temp.next = head;
            return temp;
        }

        Node curr = head;
        while(curr.next != null && curr.next.data < item)
            curr = curr.next;

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

       head = sortedInsert(head, 35);
        printList(head);
    }
}
