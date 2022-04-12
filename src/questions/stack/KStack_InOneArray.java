package questions.stack;

import java.util.Arrays;

public class KStack_InOneArray {

    int []arr;
    int []top;
    int []next;

    int s;
    int n;

    int freespot;

    public KStack_InOneArray(int N, int S) {
        s = S;
        n = N;

        arr = new int[s];
        top = new int[n];
        next = new int[s];

        for(int i=0; i<n; i++){
            top[i] = -1;
        }
        for(int i=0; i<s; i++){
            next[i] = i+1;
        }

        next[s-1] = -1;

        freespot = 0;
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        //check for overflow
        if(freespot == -1) {
            return false;
        }

        //find index
        int index = freespot;

        //insert element into array
        arr[index] = x;

        //update freespot
        freespot = next[index];

        //update next;
        next[index] = top[m-1];

        //update top
        top[m-1] = index;

        return true;

    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        //check underflow condition
        if(top[m-1] == -1) {
            return -1;
        }

        int index= top[m-1];

        top[m-1] = next[index];

        next[index] = freespot;

        freespot = index;

        return arr[index];
    }

    public static void main(String[] args) {
        KStack_InOneArray ks = new KStack_InOneArray(3, 6);
        ks.push(10, 1);
        ks.push(20, 1);
        ks.push(30, 2);
        System.out.println(Arrays.toString(ks.arr));
    }
}
