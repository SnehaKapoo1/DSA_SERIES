package recursion.stringQuestions;

public class SkipCharacter {

    public static String skipChar(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
        char c = str.charAt(0);
        if(c == 'a'){
            return skipChar(str.substring(1), ans);
        }else{
            return skipChar(str.substring(1), ans + c);
        }
    }

    public static String skipChar2(String str){
        if(str.isEmpty()){
            return " ";
        }
        char c = str.charAt(0);
        if(c == 'a'){
            return skipChar2(str.substring(1));
        }else{
            return c + skipChar2(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipChar("baccad", ""));
        System.out.println(skipChar2("baccad"));
    }
}
