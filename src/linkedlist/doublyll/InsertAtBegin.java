package linkedlist.doublyll;

import static linkedlist.doublyll.Creationdll.printlist;

public class InsertAtBegin {
    public static Node insertBeginning(Node head, int item){
        Node temp = new Node(item);
        temp.next = head;
        if(head != null) head.prev = temp;
        return temp;
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

            head = insertBeginning(head, 5);
            printlist(head);
        }
}
