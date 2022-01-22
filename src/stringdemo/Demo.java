package stringdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        String s = "Hello friends from LPU. Welcome to Java";

        String split[] = s.split(" ");
        /*for(String words: split)
            System.out.println(words);

        System.out.println(split.length);*/
        List<Integer> output = getIndex(s, 'a');
        System.out.println(output);
    }

    private static List<Integer> getIndex(String s, char e) {
        int n = s.length();
        List<Integer> listOfInd = new ArrayList<>();

        for(int i=0; i< n; i++){
            if(s.charAt(i) == e){
                listOfInd.add(i);
            }
        }
        return listOfInd;
    }
}
