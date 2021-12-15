package recursion.stringQuestions;

import java.util.ArrayList;

public class LetterCombination_Of_PhoneNumber {
    public static void main(String[] args) {
      /* ArrayList<String> ans=  sub2("", "23");
        System.out.println(ans);*/
        int ans=  subCount("", "12");
        System.out.println(ans);

    }

    static void sub(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i= (digit -1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            sub(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> sub2(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        for(int i= (digit -1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(sub2(p + ch, up.substring(1)));
        }
        return list;
    }

    static int subCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        int digit = up.charAt(0) - '0';
        for(int i= (digit -1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            count = count + subCount(p + ch, up.substring(1));
        }

        return count;
    }
}
