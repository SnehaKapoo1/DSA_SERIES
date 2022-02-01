package infosys_questions;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int asec[] = new int[n];
        for(int i=0; i<n; i++){
            asec[i] = sc.nextInt();
        }
        Arrays.sort(asec);

        int desc[] = new int[n];
        int j=0;
        for(int i = asec.length-1; i>=0; i--){
            desc[j++] = asec[i];
        }

        /*for(int f=0, s =1; f<s && s < n; f +=2, s +=2){
            int temp = desc[f];
            desc[f] = desc[s];
            desc[s] = temp;
        }*/
        for(int f=0; f< n-1; f +=2){
            int temp = desc[f];
            desc[f] = desc[f+1];
            desc[f+1] = temp;
        }

        System.out.println(Arrays.toString(desc));
    }
}
