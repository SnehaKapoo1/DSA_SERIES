package recursion.SubSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSeqReturnArrayList {
    public static void main(String[] args) {
        System.out.println(subset("", "mom"));
    }

    static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            Collections.sort(list);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subset(p + ch, up.substring(1));
        ArrayList<String> right = subset(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
