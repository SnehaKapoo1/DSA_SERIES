package heap;

public class OwnMinHeapImple {
    int arr[];
    int size;
    int capacity;

    OwnMinHeapImple(int c){
        arr = new int[c];
        size =0;
        capacity = c;
    }

    int left(int i){
        return 2 * i + 1;
    }

    int right(int i){
        return 2 * i + 2;
    }

    int parent(int i){
        return (i-1)/2;
    }

    public static void main(String[] args) {
        OwnMinHeapImple minHeapImple = new OwnMinHeapImple(11);
        System.out.println(minHeapImple.capacity);
    }
}
