package linkedlist.singlyll;

import static linkedlist.singlyll.Traversal.printList;

class Deletion {
    public static Node deleteHeadNode(Node head){
        if(head == null)
            return null;
        return head.next;
    }

    public static Node deleteLastNode(Node head){
        if(head == null || head.next == null) return null;
        Node curr = head;
        while(curr.next.next!=null)
            curr = curr.next;

        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        System.out.println();

        head = deleteHeadNode(head);
        printList(head);

        System.out.println();

        head = deleteLastNode(head);
        printList(head);
    }
}
