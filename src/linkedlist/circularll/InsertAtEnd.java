package linkedlist.circularll;

public class InsertAtEnd {
    public static Node insertAtEndNaive(Node head, int item){
        Node temp = new Node(item);
        if(head == null)
            temp.next = temp;
        if(head.next == head){
            head.next = temp;
            temp.next = head;
            return head;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }

    public static Node insertEndCLLEfficient(Node head, int item){
        Node temp = new Node(item);
        if(head == null)
            temp.next = temp;

        else{
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
        }
        return temp;
    }
}
