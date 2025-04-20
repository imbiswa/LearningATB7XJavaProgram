package Practice2025;

import java.util.HashMap;

public class String4 {
    public static void main(String[] args) {
        String str = "aaaaabbbccc";
        countCharacters(str);
    }
//Java program to count Occurrences of Each Character in
    //aaabbbcc-a3b3c2 (this type of programm also can be done)

    //The getOrDefault() method in Java is used to retrieve a value from a HashMap based on a key.
    // If the key exists, the method returns the associated value. However, if the key is not found,
    // the method returns a specified default value instead of null.


    //keySet return set of all unique keys
    public static void countCharacters(String str)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Occurrences:");
        for (char c : charCountMap.keySet()) {
            System.out.println(c + " : " + charCountMap.get(c));
        }
    }
}