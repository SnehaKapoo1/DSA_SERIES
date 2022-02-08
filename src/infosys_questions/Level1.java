package infosys_questions;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Level1 {

    private static String unique(String str) {

        Vector<Character> sortedAlpha = new Vector<>();
        Vector<Character> sortedDigit = new Vector<>();

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                char c = str.charAt(i);
                sortedAlpha.add(c);
            }else {
                sortedDigit.add(str.charAt(i));
            }
        }

        Collections.sort(sortedAlpha);
        Collections.sort(sortedDigit);

        int alphaFirstOccIndex = str.indexOf(sortedAlpha.get(0));
        int alphaLastOccIndex = str.indexOf(sortedAlpha.get(sortedAlpha.size()-1));
        int alphaDiff = Math.abs(alphaFirstOccIndex - alphaLastOccIndex);

        int digitDiff =0;
        if(!sortedDigit.isEmpty()){
            int digitFirstOccIndex = str.indexOf(sortedDigit.get(0));
            int digitLastOccIndex = str.indexOf(sortedDigit.get(sortedDigit.size()-1));
             digitDiff= Math.abs((Integer.parseInt(String.valueOf(digitFirstOccIndex))) - Integer.parseInt(String.valueOf(digitLastOccIndex)));
        }

        int digitSum =0;
        for (int i =0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                digitSum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }

        String ans = "";
        for (int ele =0; ele < sortedAlpha.size(); ele++){
            ans = ans + sortedAlpha.get(ele);
        }
         ans = ans + alphaDiff + ':';
        int finalDigit = digitSum * 10 + digitDiff;
        ans = ans + finalDigit;

       return sortedDigit.size() ==0 ? String.valueOf(-1) : ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //unique(str);
        System.out.println(unique(str));

    }
}
