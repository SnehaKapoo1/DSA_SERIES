package questions.linkedList;

public class FindMiddle {
    public static void findMiddleNaive(Node head){
        if(head == null) return;

        int count =0;
        Node curr;
        for(curr = head; curr != null; curr = curr.next)
            count++;
        curr = head;
        for(int i=0; i<count/2; i++){
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void findMiddleEfficient(Node head){
        if(head == null) return;
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        printList(head);

        System.out.println();
        findMiddleNaive(head);

        findMiddleEfficient(head);
    }
}
