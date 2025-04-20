package Practice2025;

public class String7 {
    public static void main(String[] args) {

        //Java program to find if a string is Palindrome

        String str  = "aba1";
        String reversed ="";

        for (int i = 0; i <=str.length()-1 ; i++)
        {

            char c = str.charAt(i);
            reversed=c+reversed;
        }

        System.out.println(reversed);
        if(str.equals(reversed))
        {
            System.out.println("String is plaindraom");
        }
        else
            System.out.println("not palindrom");
    }
}
