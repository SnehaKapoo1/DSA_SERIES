package queue;

public class SimpleArrayImplementationOfArray {

    int cap;
    int size;
    int[] arr;

    SimpleArrayImplementationOfArray(int c){
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    void enque(int item){
        if(isFull())
            return;

        arr[size] = item;
        size++;
    }

    void deque(){
        if(isEmpty())
            return;

        for(int i=0; i< size-1; i++){
            arr[i] = arr[i+1];
        }
    }

    int getFront(){
        if(isEmpty())
            return -1;

        return arr[0];
    }

    int getRear(){
        if (isEmpty())
            return -1;

        return arr[size-1];
    }

    boolean isFull(){
       return (size == cap) ? true : false;
    }

    boolean isEmpty(){
        return size == 0 ? true : false;
    }

    public static void main(String[] args) {
        SimpleArrayImplementationOfArray s = new SimpleArrayImplementationOfArray(5);
        s.enque(10);
        s.enque(20);
        s.enque(30);
        s.deque();
        System.out.println(s.getFront());
        System.out.println(s.getRear());
    }
}
