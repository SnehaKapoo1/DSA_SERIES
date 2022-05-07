package deque;

public class ArrayImpDeque {
    int size;
    int capacity;
    int[] deArray;

    ArrayImpDeque(int c){
        capacity = c;
        size = 0;
        deArray = new int[capacity];
    }

    void insertFront(int ele){
       if(isFull())
           return;

       for(int i= size-1; i>=0; i--){
           deArray[i+1] = deArray[i];
       }
       deArray[0] = ele;
       size++;
    }

    void deleteFront(){
        if(isEmpty())
            return;
        for(int i= 0; i< size -1; i++){
            deArray[i] = deArray[i+1];
        }
        size--;
    }

    void insertRear(int ele){
        if(isFull())
            return;

        deArray[size] = ele;
        size++;
    }

    int getRear(){
        if(isEmpty())
            return -1;
        return deArray[size -1];
    }

    int getFront(){
        if(isEmpty())
            return -1;
        return deArray[0];
    }

    void deleteRear(){
        if(isEmpty())
            return;
        size--;
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
        ArrayImpDeque de = new ArrayImpDeque(7);
        de.insertFront(30);
        de.insertRear(40);
        de.insertFront(20);
        de.insertRear(50);
        de.printDe();
    }
}
