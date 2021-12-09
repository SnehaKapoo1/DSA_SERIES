package recursion.ArrayRecur;

public class ArraySortedOrNot {
    public static void main(String[] args){
       int arr[] = {1,2,3,4,8,16};
       System.out.println(check(arr, 0, 1));
    }

    static boolean check(int arr[], int s, int e){
        if(s == arr.length-1){
            return true;
        }
        if(arr[s] < arr[e]){
            return check(arr, s+1, e+1);
        }else{
            return false;
        }
    }
}
