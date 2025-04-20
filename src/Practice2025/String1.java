package Practice2025;

public class String1 {

    public static void main(String[] args) {

// Java program to reverse a string

        String str = "India";
        String reversed ="";

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            reversed = c+reversed;
        }
        System.out.println(reversed);
    }
}
