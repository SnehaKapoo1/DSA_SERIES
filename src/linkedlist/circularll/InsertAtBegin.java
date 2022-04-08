package linkedlist.circularll;

public class InsertAtBegin {
    public static Node insertBeginCLLNaive(Node head, int item){
        Node temp = new Node(item);
        if(head == null)
            temp.next = temp;

        temp.next = head; // made new head
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = temp; // made list as circular
        return temp;
    }
    public static Node insertBeginCLLEfficient(Node head, int item){
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
        return head;
    }
}
