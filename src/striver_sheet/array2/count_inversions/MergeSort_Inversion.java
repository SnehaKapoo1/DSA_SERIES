package striver_sheet.array2.count_inversions;

public class MergeSort_Inversion {
    static int countInver(int[] arr, int l, int r){
        int res =0;
        if(r > l){
            int m = l+(r-l)/2;
            res += countInver(arr, l, m);
            res += countInver(arr, m+1, r);
            res += countAndmerge(arr, l, m, r);
        }
        return res;
    }

    private static int countAndmerge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1; int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(int j=0; j<n2; j++){
            right[j] = arr[m+j+1];
        }

        int res =0, i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
            {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                res=res+(n1-i);
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }

    public static void main(String[] args) {
        int[] arr= {40, 30, 20, 10};
        System.out.println(countInver(arr, 0, arr.length-1));
    }
}
