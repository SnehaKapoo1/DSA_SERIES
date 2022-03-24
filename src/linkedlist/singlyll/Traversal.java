package linkedlist.singlyll;

 class Node{
     int data;
     Node next;
    Node(int ele){
        data = ele;
        next = null;
    }
}
public class Traversal {

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void recursiveDisplay(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " ");
        recursiveDisplay(head.next);
    }

    public static int searchItemIterative(Node head, int item){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if(curr.data == item){
                return pos-1;
            }else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public static int recursiveSearch(Node head, int item){
      if(head == null)
          return -1;
      if(head.data == item) return 1;
      else {
          int result = recursiveSearch(head.next, item);
          if (result == -1) return -1;
          else return (result + 1);
      }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        System.out.println();
        recursiveDisplay(head);
        System.out.println();
        System.out.println("Searched element is at index" + ": " + searchItemIterative(head, 20));
        System.out.println();
        System.out.println("Searched element is at position" + ": " + recursiveSearch(head, 40));
    }
}