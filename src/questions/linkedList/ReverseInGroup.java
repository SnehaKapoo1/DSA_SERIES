package questions.linkedList;

import static questions.linkedList.Reverse.printList;

public class ReverseInGroup {
    public static Node reverseInGroup(Node head, int k_group){
        if(head == null) return null;
        Node prev = null, curr = head, ahead = null;
        int count =0;
        while(curr != null && count < k_group){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
            count++;
        }

        if(ahead != null){
            Node rest_head = reverseInGroup(ahead, k_group);
            head.next = rest_head;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        printList(head);
        head = reverseInGroup(head, 3);
        System.out.println();
        printList(head);
    }
}
