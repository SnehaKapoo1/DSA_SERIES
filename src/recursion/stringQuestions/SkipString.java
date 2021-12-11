package recursion.stringQuestions;

public class SkipString {
    static String skipStr(String str){
        if(str.isEmpty()){
           return str;
        }

        if(str.startsWith("kunal")){
            return skipStr(str.substring(5));
        }else{
            return str.charAt(0) +  skipStr(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipStr("kunalkushwaha"));
    }
}
