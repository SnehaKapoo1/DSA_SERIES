package gfg_ques;
import java.util.ArrayList;

class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> patterns
                = new ArrayList<String>();

        // Function Call
        patterns = spaceString("ABC");

        // Print patterns
        for (String s : patterns)
        {
            System.out.println(s);
        }
    }
    private static ArrayList<String>
    spaceString(String str)
    {

        ArrayList<String> strs = new ArrayList<String>();

        if (str.length() == 1)
        {
            strs.add(str);
            return strs;
        }

        ArrayList<String> strsTemp = spaceString(str.substring(1, str.length()));

        for (int i = 0; i < strsTemp.size(); i++)
        {

            strs.add(str.charAt(0) + strsTemp.get(i));
            strs.add(str.charAt(0) + " " + strsTemp.get(i));
        }

        return strs;
    }
    }
