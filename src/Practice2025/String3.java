package Practice2025;

import java.util.ArrayList;

public class String3 {


    public static void main(String[] args) {
        //Java program to find duplicate characters in a string
        String str ="abccda";
        getDuplicate(str);


    }

    public static void getDuplicate(String word)
    {
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i <=word.length()-1 ; i++) {
            for (int j = i+1; j <=word.length()-1; j++) {

                if(word.charAt(i)==word.charAt(j))
                {
                    chars.add(word.charAt(j));
                   // System.out.println(word.charAt(j)+ " is dupicate");
                }

            }
        }
        System.out.println("Dupicates are: "+chars);

    }
}
