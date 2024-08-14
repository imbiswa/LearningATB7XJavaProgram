package StringProg;

import java.util.Scanner;

public class Palindrom
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string : ");
        String string = sc.next();
        String newString ="";
        char ch;
        System.out.print(string.length());



        for (int i = 0; i <string.length() ; i++)
        {
           ch= string.charAt(i);
           newString= ch+newString;
;        }

        System.out.println(newString);
        if (string.equals(newString))
        {
            System.out.println("palindrom");
        }
        else
            System.out.println("not palindrom");
    }
}
