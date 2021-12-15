package recursion.stringQuestions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombiOfPhnNum_LeetCode_ModifiedVersion {
    public static void main(String[] args) {
        List<String> ans = pad("", "23");
        System.out.println(ans);
    }

    public static List<String> pad(String p, String up){
        List<String> list = new ArrayList<>();

        if(up.isEmpty()){

            if(p=="")
            {
                return list;
            }

            list.add(p);
            return list;
        }

        String [] code = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        String codeForch = code[up.charAt(0) - '0'];
        for(int i=0; i <codeForch.length(); i++){
            char ch = codeForch.charAt(i);
            list.addAll(pad(p + ch, up.substring(1)));
        }
        return list;
    }

}
