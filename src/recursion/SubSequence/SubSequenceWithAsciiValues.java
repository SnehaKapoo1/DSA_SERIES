package recursion.SubSequence;

public class SubSequenceWithAsciiValues {

    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println();
        getAsciiValueOfChar('a');
    }

    static void subSeq(String p, String up){  // p = processed, up = unprocessed(original string)

        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1)); // take it
        subSeq(p, up.substring(1)); // ignore it
        subSeq(p + (ch+0), up.substring(1));
    }

    static void getAsciiValueOfChar(char ch){
        System.out.println("AsciiValueOfChar " + ch + " is " + (ch + 0));
    }
}
