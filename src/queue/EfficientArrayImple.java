package queue;

public class EfficientArrayImple {
    int front, cap, size, rear;
    int[] arr;

    EfficientArrayImple(int c){
        arr = new int[c];
        cap = c;
        size =0;
        front =0;
        rear = cap -1;
    }

    void enque(int item){
        if(isFull())
            return;
        rear = (rear + 1) % cap;
        arr[rear] = item;
        size++;
    }

    int deque(){
        if(isEmpty())
            return -1;

        int dequed_item = arr[front];
        front = (front + 1) % cap;
        size--;

        return dequed_item;
    }

    int getFront(){
        if(isEmpty())
            return -1;

        return arr[front];
    }

    int getRear(){
        if (isEmpty())
            return -1;

        return arr[rear];
    }

    boolean isFull(){
        return (size == cap) ? true : false;
    }

    boolean isEmpty(){
        return size == 0 ? true : false;
    }

    public static void main(String[] args) {
        EfficientArrayImple s = new EfficientArrayImple(5);
        s.enque(10);
        s.enque(20);
        s.enque(30);
        s.deque();
        System.out.println(s.getFront());
        System.out.println(s.getRear());
        s.enque(40);
        s.enque(50);
        s.enque(60);
        s.enque(70);
        s.deque();
        System.out.println(s.getFront());
        System.out.println(s.getRear());
    }

}
