package infytq;

import java.util.Arrays;

public class DoNotSplit {
    static void compareFirst(int arr[]){
        int temp =0;
        for(int i=0; i< arr.length; i++){
            int num = arr[i];
            int d = (int)(Math.log10(num));
            int first = (int)(num/ (int) (Math.pow(10,d)));
            if(temp > first){
                System.out.print(num);
            }
            else if(temp == first){
                String s = String.valueOf(num);
                check(s, temp);
            }
            else if(temp < first){
                temp = first;
            }
        }
    }

    private static void check(String s, int temp) {
        for(int i=1; i<s.length(); i++){
            int c = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(temp > c){
                break;
            }else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 76, 415};
          compareFirst(arr);
    }
}
