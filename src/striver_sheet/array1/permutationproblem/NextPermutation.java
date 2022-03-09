package striver_sheet.array1.permutationproblem;

import java.util.Arrays;

public class NextPermutation {
    public static int[] nextPermutation(int A[]){
        if(A == null || A.length <=0) return A;
        int i=A.length-2;
        while(i >=0 && A[i] >= A[i+1]) i--;
        if(i >= 0){
            int j = A.length-1;
            while(j >=0 && A[j] <= A[i]) j--;
            swap(A, i, j);
        }
        reverse(A, i+1, A.length-1);
        return A;
    }
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void reverse(int[] A, int i, int j){
        while(i < j){
            swap(A, i++, j--);
        }
    }
    public static void main(String[] args) {
        int[] num= {1, 2,3};
        int[] ans = nextPermutation(num);
        System.out.println(Arrays.toString(ans));
    }
}
