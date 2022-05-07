package deque;

public class EfficientImple {

    int front;
    int size;
    int []deArray;
    int capacity;

    EfficientImple(int cap){
        front = 0;
        capacity = cap;
        size =0;
        deArray = new int[capacity];
    }

    int deleteFront(){
        front = (front+1) % capacity;
        size--;
        return deArray[front];
    }

    int deleteRear(){
        front = (front+1) % capacity;
        size--;
        return deArray[front];
    }

    void insertRear(int ele){
        if(isFull())
            return;

        int rear = (front + size)%capacity;
        deArray[rear] = ele;
        size++;
    }

    void insertFront(int ele){
        if(isFull())
            return;
        front = (front + capacity -1) % capacity;
        deArray[front] = ele;
        size++;
    }

    int getFront(){
        if(isEmpty())
            return -1;
        return deArray[front];
    }

    int getRear(){
        if(isEmpty())
            return -1;
        return (front + size) % capacity;
    }

    boolean isFull(){
        return (size == capacity);
    }

    boolean isEmpty(){
        return (size == 0);
    }

    void printDe(){
        for(int i=0; i<capacity; i++){
            System.out.print(deArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        EfficientImple de = new EfficientImple(7);
        de.insertFront(30);
        de.insertRear(40);
        de.insertFront(20);
        de.insertRear(50);
        de.printDe();
    }
}
