package hacker_rank.array_ques.hashing;

import java.util.HashSet;

public class TwoString {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> hs = new HashSet<>();
        for(Character c : s1.toCharArray()){
            hs.add(c);
        }
        for(Character ele : s2.toCharArray()){
            if(hs.contains(ele)){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "world";

        String s1 = "hi";
        String s2 = "world";

        System.out.println(twoStrings(s1, s2));

    }

}
