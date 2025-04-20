package CollectionFramework;

import java.util.ArrayList;

public class Day1_Prorg2 {
//count of duplicate characters in a string
    public static void main(String[] args) {
        String str ="abcdad";
        int count=0;

        for (int i = 0; i < str.length() ;i++) {
            for (int j = i+1; j < str.length(); j++) {

                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                    System.out.println(str.charAt(j));
                }

            }

        }
        System.out.println(count);

    }
}
