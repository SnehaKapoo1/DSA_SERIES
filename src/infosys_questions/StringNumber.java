package infosys_questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringNumber {
    static int meth(String []str) {
        int num1 = 0;
        StringBuilder num2 = new StringBuilder();
        int ind4 = 0;
        int ind7 = 0;
        int []temp = new int[str.length];

        for(int i=0; i<temp.length; i++){
            temp[i] = Integer.parseInt(str[i]);
            if(temp[i] == 4)
                ind4 = i;
            else if(temp[i] == 7)
                ind7 = i;
        }

        for (int i = ind4; i<= ind7; i++){
            num2.append(str[i]);
            temp[i] =0;
        }
        for (int j : temp) {
            num1 += j;
        }

        return num1 + Integer.parseInt(num2.toString());
    }

    //3,2,6,5,1,4,8,9
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []str = br.readLine().split(",");
        System.out.println(meth(str));
    }
    }
