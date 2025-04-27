package Practice2025;

import java.util.Scanner;

public class ReverseWords3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String setence=sc.nextLine();
        String[] words = setence.split(" ");
        StringBuilder reversedSenterce = new StringBuilder();
        for (String word:words) {
            reversedSenterce.append(reverseWord(word)).append(" ");
        }
        System.out.println(reversedSenterce);
    }
    public static String reverseWord(String word)
    {
        String revrsedword ="" ;
        for (int i = 0; i <word.length() ; i++) {

            char c =word.charAt(i);
            revrsedword = c + revrsedword;
        }
        return revrsedword;
    }
}
