package linkedlist.singlyll;


class Node{
    int data;
    Node next;
    Node(int ele){
        data = ele;
        next = null;
    }
}
public class Traversal {

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void recursiveDisplay(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " ");
        recursiveDisplay(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        System.out.println();
        recursiveDisplay(head);
    }
}