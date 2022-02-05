package leetcode_ques.hashing;

import java.util.HashMap;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int result =0;

        for(int i=0; i < stones.length(); i++){
            char ch = stones.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }

        for(int i=0; i < jewels.length(); i++){
            char ch = jewels.charAt(i);
            if(hm.containsKey(ch)){
                result += hm.get(ch);
            }
        }
        return result;
    }
}
