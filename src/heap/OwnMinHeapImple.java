package heap;

import java.util.Arrays;

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

    void insertItems(int ele){
        if(size == capacity) return;
        size++;
        arr[size -1] = ele;
        for(int i = size-1; i!=0 && arr[parent(i)]>arr[i];){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;

            i = parent(i);
        }
    }

    public static void main(String[] args) {
        OwnMinHeapImple minHeapImple = new OwnMinHeapImple(11);
        System.out.println(minHeapImple.capacity);
        minHeapImple.insertItems(10);
        minHeapImple.insertItems(20);
        minHeapImple.insertItems(15);
        minHeapImple.insertItems(40);
        minHeapImple.insertItems(50);
        minHeapImple.insertItems(100);
        minHeapImple.insertItems(25);
       // minHeapImple.insertItems(10);
        System.out.println(Arrays.toString(minHeapImple.arr));

    }
}
