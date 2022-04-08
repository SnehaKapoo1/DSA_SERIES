package questions.searching;

public class FirstRepeatedChar {

    static void findReBruteForce(String s){
        int count =1;
        for(int i=0; i<s.length(); i++){
            for (int j=i+1; j <s.length(); j++){
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                    System.out.print(s.charAt(i) + " : " + count);
                }
                break;
            }
        }
    }

    static void findRepEff(char[] str ){
       // = s.toCharArray();
        int[] count = new int[256];
        for(int i=0; i<256; ++i){
            count[i] = 0;
        }
        for(int i=0; i< str.length; ++i){
            if(count[str[i]] == 1){
                System.out.println(str[i]);
                break;
            }else {
                count[str[i]]++;
            }
        }

    }

    public static void main(String[] args) {
        String s = "tree";
        char arr[] ={'t', 'r', 'e', 's'};

        findRepEff(arr);
    }
}
