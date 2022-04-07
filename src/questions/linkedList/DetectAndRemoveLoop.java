package questions.linkedList;

public class DetectAndRemoveLoop {
    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        if(head == null || head.next == null)
            return null;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }
        if(fast != slow)
            return null;

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
