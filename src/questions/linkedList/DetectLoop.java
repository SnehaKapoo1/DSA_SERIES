package questions.linkedList;

import java.util.HashSet;

public class DetectLoop {

    static Node head; // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static boolean detectLoopMethod1(Node head){
        HashSet<Node> hs = new HashSet<>();
        while(head != null){
            if(hs.contains(head))
                return true;

            hs.add(head);
            head = head.next;
        }

        return false;
    }

    public static boolean detectLoopMethod2(Node head){
        Node temp = new Node(0);
        Node curr = head;

        while(curr != null){
            if(curr.next == null)
                return false;
            if(curr.next == temp)
                return true;

            Node currNext = curr.next;
            curr.next = temp;
            curr = currNext;
        }
        return false;
    }

    public static boolean detectLoopMethod3(Node head){
        Node slow = head;
        Node fast = head;

        Node curr = head;
        while(fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }

    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String[] args)
    {
        DetectLoop llist = new DetectLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

       /* if (detectLoopMethod1(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");*/

        if (detectLoopMethod3(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}
