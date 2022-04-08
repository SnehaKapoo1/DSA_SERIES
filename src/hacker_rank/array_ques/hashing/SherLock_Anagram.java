package hacker_rank.array_ques.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SherLock_Anagram {

    static int sherlockAndAnagrams(String s) {

        int len = s.length();
        int ans = 0;
        //counter map for substring
        HashMap<String, Integer> subMap = new HashMap<>();
        //iterate through all the possible substring of s
        for (int i = 1; i < len; i++) {//starting with size 1,2,3,4
            for (int j = 0; i + j < len + 1; j++) {
                String sub = s.substring(j, i + j);
                //before putting the substring into the map, sort the string
                //in this way abc, acb will result in abc abc pair
                char[] subArray = sub.toCharArray();
                Arrays.sort(subArray);
                String subSorted = new String(subArray);
                Integer subNumber = subMap.get(subSorted);
                if (subNumber == null)//check if the sequnece already exists
                    subMap.put(subSorted, 1);//put in for the first time
                else {
                    subNumber++;//sub already inserted so update plus 1
                    subMap.put(subSorted, subNumber);
                    //if we have values o n for a sub
                    //increse ans with n*(n-1)/2 but removing the value of the preceding
                    //iteratrion -= (n-1)*(n-2)/2
                    ans -= ((subNumber - 1) * (subNumber - 2)) / 2;
                    //System.out.println("ans first " + ans);
                    ans += (subNumber * (subNumber - 1)) / 2;
                    //System.out.println("ans second " + ans);
                }

            }
        }
        return ans;

    }


    public static void main(String[] args) {

        String s = "abba";
        System.out.println(sherlockAndAnagrams(s));

    }
}
