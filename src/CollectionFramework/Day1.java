package CollectionFramework;

import java.util.ArrayList;

public class Day1 {

    public static void main(String[] args) {
        //find duplicate character froma string

        String str ="abcdad";
        ArrayList<Character> ac = new ArrayList<>();
        ArrayList<Character> duplicate = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (!ac.contains(c))
            {
                ac.add(c);
            }
            else
                duplicate.add(c);


        }

        System.out.println(ac);
        System.out.println(duplicate);
    }
}
