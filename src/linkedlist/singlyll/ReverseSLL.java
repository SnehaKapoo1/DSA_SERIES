package linkedlist.singlyll;

public class ReverseSLL {
    public static Node reverseMethod(Node head){
        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        head.next = null;
        head = prev;

        return head;
    }
}
