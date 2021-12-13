package recursion.permutation;

public class CountNumberOfPermutation {
    public static void main(String[] args) {
        System.out.println(permutationCount("", "abc"));
        //System.out.println(permutation("", "abc", 0));
    }

    static int permutationCount(String p, String up){
        if(up.isEmpty()){
           return 1;
        }

        char ch = up.charAt(0);
        int count =0;
        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + permutationCount(f + ch + s, up.substring(1));
        }

        return count;
    }

   /* static int permutation(String p, String up, int count){
        if(up.isEmpty()){
         return;
        }

        char ch = up.charAt(0);
        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            return permutation(f + ch + s, up.substring(1), count+1);
        }

        return count;
    }*/
}
