package queue;


class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class LinkedListImple {
 Node front, rear;
 int size=0;
 LinkedListImple(){
     front = rear = null;
 }

 void enque(int item){
    Node temp = new Node(item);
    size++;
    if(front == null){
        front = rear = temp;
        return;
    }

    rear.next = temp;
    rear = temp;
 }

 void deque(){
     size--;
     if(front == null)
         return;
     front = front.next;

     if (front == null)
         rear = null;
 }

    public static void main(String[] args) {
        LinkedListImple ll = new LinkedListImple();
        ll.enque(10);
        ll.enque(20);
        ll.enque(30);
        ll.enque(40);
        ll.deque();
        System.out.println(ll.front.data);
        System.out.println(ll.rear.data);
        System.out.println(ll.size);

    }
}
