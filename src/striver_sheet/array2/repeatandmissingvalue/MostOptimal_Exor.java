package striver_sheet.array2.repeatandmissingvalue;

public class MostOptimal_Exor {
    static void find(int[] arr,int n){
        int exor =arr[0];
        for(int i=1; i<n; i++){
            exor = exor ^ arr[i];
        }

        for(int i=1; i <= n; i++){
            exor ^= i;
        }

        int x=0; int y =0; int set_bit_no;

        /* Get the rightmost set bit in set_bit_no */
        set_bit_no = exor & ~(exor - 1);

        for(int i=0; i<n; i++){
            if((arr[i] & set_bit_no) != 0)
                x ^= arr[i];
            else
                y ^= arr[i];
        }
        for (int i=1; i<=n; i++){
            if((i & set_bit_no) != 0)
                x ^= i;
            else
                y ^= i;
        }
        System.out.println(x + "," + y);
    }

    public static void main(String[] args) {
        int[] arr= {3, 1, 2, 5, 3};
        int[] arr2 = {4, 3, 6, 2, 1, 1};
        //int[] arr = {3,1,2,5,4,6,7,5};
        //System.out.println(Arrays.toString(find(arr, arr.length)));
        find(arr, arr.length);
    }
}
