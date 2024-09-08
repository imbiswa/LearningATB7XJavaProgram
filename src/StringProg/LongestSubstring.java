package StringProg;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {




        String s = "missioneruioash123";
        ArrayList<Character> c = new ArrayList<>();
        String ns ="";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!c.contains(currentChar)) {
                c.add(currentChar);
            }
        }
        for (int i = 0; i <c.size() ; i++)
        {
            ns=ns+c.get(i);
        }
        System.out.print(ns);
    }
}
