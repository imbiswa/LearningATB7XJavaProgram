package StringProg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str1 = "race";
        String str2 = "carui";
        if (str1.length() == str2.length()) {


            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("anagram");
            } else {
                System.out.println("not anagram");
            }
        }

        else {
            System.out.println("length mismatch to be an anagram");
        }
    }
}
