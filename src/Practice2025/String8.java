package Practice2025;

import java.util.Arrays;

public class String8 {
    public static void main(String[] args) {
//ava program to determine if Two Strings are Anagrams
        String str1= "listen";
        String str2= "silent";

        if(str1.length()==str2.length())
        {
            char[] char1=str1.toCharArray();
            char[]chr2=str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(chr2);
            System.out.println("So string is angram:"+Arrays.equals(char1,chr2));;
        }
        else
            System.out.println("length is not matching ");
    }
}
