package infosys_questions;

import java.util.Scanner;

class Q1 {
    static String str;
    static int cash, n, a, b;

    static void swapf() {
        char s[] = str.toCharArray();
        int i = 0;
       for(int a =0; a<s.length; a++){
           if(s[a] == '1'){
               i = a;
               break;
           }
       }

       int j = s.length-1;
       while(j > i){
           if(cash < a) break;
           if(s[j] == '0'){
               if(s[i] == '0'){
                   i++;
               }else{
                   char temp = s[i];
                   s[i] = s[j];
                   s[j] = temp;

                   cash -=a;
                   j--;
               }
           }else{
               j--;
           }
        }
        str = new String(s);
    }

    static void flipf() {
       char ch[] = str.toCharArray();
       int i=0;
       for(int a=0; a< ch.length; a++){
           if(ch[a] == '1'){
               i = a;
               break;
           }
       }

       while(cash > b){
           if(i == ch.length) break;
           if(ch[i] == '1'){
               ch[i] = '0';
               i++;
               cash -=b;
           }
       }

       str = new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        str = sc.next();
        cash = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

       /* n =4;
        str = "111000";
        cash = 7;
        a =3;
        b =2;*/

        if (a < b) {
            swapf();
            flipf();
        } else {
            flipf();
            swapf();
        }
        System.out.println(Integer.parseInt(str, 2));
    }
}