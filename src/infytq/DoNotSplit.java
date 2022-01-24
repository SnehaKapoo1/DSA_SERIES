package infytq;

import java.util.*;

import java.util.*;

class DoNotSplit {
    static void printLargest(int []arr)
    {
        int n = arr.length;
        Vector<String> list = new Vector<>();
        for (int ele: arr){
            list.add(String.valueOf(ele));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String A, String B) {
                String AB = A + B;
                String BA = B + A;
                return AB.compareTo(BA) > 0 ? -1 : 1;
            }
        });

        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {10, 7, 76, 415};
        printLargest(arr);
    }
}












