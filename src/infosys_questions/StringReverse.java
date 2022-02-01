package infosys_questions;

import java.util.Arrays;

class StringReverse{
    public static void reverse(char str[])
    {
        int r = str.length - 1, l = 0;

        while (l < r)
        {
            if (!Character.isAlphabetic(str[l]) || str[l] == ' ')
                l++;
            else if(!Character.isAlphabetic(str[r]) || str[l] == ' ')
                r--;
            else
            {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "A man, in the boat says : I see 1-2-3 in the sky";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }
}