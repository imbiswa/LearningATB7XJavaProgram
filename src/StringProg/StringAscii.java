package StringProg;

import java.util.Scanner;

public class StringAscii {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        //System.out.print("Enter the string you want to see char Ascii: ");
        String s ="we are stu";

        for (int i = 0; i <s.length() ; i++)
        {
            char c = s.charAt(i);
            System.out.println(c+" "+(int)c);
            Character.isWhitespace(c);


        }

    }
}
