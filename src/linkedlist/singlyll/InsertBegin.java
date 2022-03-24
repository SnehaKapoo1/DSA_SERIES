package linkedlist.singlyll;

public class InsertBegin {
    public static Node insertBegin(Node head, int item){
        Node temp = new Node(item);
        temp.next = head;
        head = temp;

        return head;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        printList(head);
    }
}
