package questions.linkedList;

public class SegregateOddAndEven {
    public static Node arrangeOddAndEven(Node head){
        if(head == null || head.next == null)
            return head;

        Node dummy_even = new Node(-1);
        Node dummy_odd = new Node(-1);
        Node curr = head, evenTail = dummy_even, oddTail = dummy_odd;

        while(curr != null){
            if(curr.data % 2 == 0){
                evenTail.next = curr;
                evenTail = evenTail.next;
            }
            else {
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
        }
        evenTail.next = dummy_odd.next;
        oddTail.next = null;
        return dummy_even.next;
    }
}
