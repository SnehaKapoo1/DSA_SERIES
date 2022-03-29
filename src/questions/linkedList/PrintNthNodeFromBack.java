package questions.linkedList;

public class PrintNthNodeFromBack {
    public static void print(Node head, int n) {
        int length = 0;
        for (Node i = head; i.next != null; i = i.next) {
            length++;
        }

        if (length < n)
            return;

        Node curr = head;
        for (int i = 0; i < length - n + 1; i++) {
             curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void printEfficient(Node head, int n){
        Node first = head;
        Node second = head;
        for(int i=0; i<n; i++){
            first = first.next;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }
    public static void main(String[] args){
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        print(head, 2);
        printEfficient(head, 3);
    }
}
