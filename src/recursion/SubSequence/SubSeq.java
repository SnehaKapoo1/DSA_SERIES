package recursion.SubSequence;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
    }

    static void subSeq(String p, String up){  // p = processed, up = unprocessed(original string)

        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1)); // take it
        subSeq(p, up.substring(1)); // ignore it
    }
}
