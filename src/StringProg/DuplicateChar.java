package StringProg;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String s = sc.next();

        for (int i = 0; i <s.length() ; i++)
        {

            for (int j = i+1; j <s.length() ; j++)
            {

                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println(s.charAt(j));
                }



            }


        }
    }
}
