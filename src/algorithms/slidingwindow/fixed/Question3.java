package algorithms.slidingwindow.fixed;
import java.util.Arrays;
import java.util.HashMap;

public class Question3 {

    public static boolean checkAnagram(String s, String ptr){

        char[] ch1 = s.toCharArray();
        char[] ch2 = ptr.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2) ? true : false;
    }

    public static int findAnagramCount(String s, String ptr){
        int count=0;
        int N =s.length();
        int n =ptr.length();

        for(int i =0; i<=N-n; i++){
            String str = s.substring(i, i+n);

            if(checkAnagram(ptr, str))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String text = "forxxorfxdofr";
        String word = "for";
        System.out.print(findAnagramCount(text, word));
        System.out.println(slidingWindow(text, word));
    }

    public static int slidingWindow(String str, String ptr){

        HashMap<Character, Integer> hm = new HashMap<>();
        int res =0;

        for(int i=0; i < ptr.length(); i++){
            char ch = ptr.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
        int count =hm.size();
        int i=0; int j=0; int k = ptr.length();
        
        while(j < str.length()){
            char ch = str.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)-1);
            }
            if(hm.get(ch) == 0){
                count--;
            }
            if(j-i+1 < k)
                j++;

            else if(j-i+1 == k){
                if(count == 0)
                    res++;

                i++;
                j++;
            }
        }
        return res;
    }
}
