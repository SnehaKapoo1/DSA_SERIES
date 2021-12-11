package recursion.stringQuestions;

// Skip a string if it is not a required string

public class Skip_A_String {
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("las") && !str.startsWith("lashes")){
            return skip(str.substring(3));
        }else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println("backlashes" + "-->" + skip("backlashes"));
        System.out.println("backlash" + "-->" + skip("backlash"));
    }
}
