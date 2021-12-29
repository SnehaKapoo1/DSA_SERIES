package questions.linkedList;


class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

public class Reverse {
	
	 public static int reverse(Node node){
	       Node curr = node;
	        Node prev = null;
	        while(curr != null){
	           Node next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }
	        return prev.data;
	    }
	 
	 public static void printList(Node head) {
		 Node curr = head;
		 while(curr != null) {
			 System.out.print(curr.data + " --> ");
			 curr = curr.next;
		 }
	 }

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printList(head);
		
		System.out.println();
		
		System.out.print(reverse(head));
		
		System.out.println();
		
		printList(head);
	}

}
