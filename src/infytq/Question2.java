package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question2 {
    static boolean isDigit(char digit) {
        if (digit >= '0' && digit <= '9') return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        produceLargestEven(str);
        //System.out.println();
    }

    private static void produceLargestEven(String str) {
        Set<Integer> hs = new HashSet<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(isDigit(ch)){
                String s = String.valueOf(ch);
                hs.add(Integer.parseInt(s));
            }
        }
        ArrayList < Integer > digitList = new ArrayList < > (hs);
        Collections.sort(digitList, Collections.reverseOrder());
        int len = digitList.size();
        boolean evenDigitFound = false;
        for (int i = len - 1; i >= 0; i--) {
            int digit = digitList.get(i);
            if (digit % 2 == 0) {
                digitList.remove(i);
                digitList.add(digit); //adding even digit at end
                evenDigitFound = true;
                break;
            }
        }
        if (evenDigitFound == false) {
            System.out.print(-1);
        } else {
            for (int dig : digitList) System.out.print(dig);
        }

    }
}