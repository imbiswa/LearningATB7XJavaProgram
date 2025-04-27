package Practice2025;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "This is a tcs interview";
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            // Condition to exclude specific words from reversing
            if (word.equalsIgnoreCase("tcs") || word.equalsIgnoreCase("a")) {
                reversedSentence.append(word).append(" ");
            } else {
                // Call custom method to reverse the word
                reversedSentence.append(reverseWord(word)).append(" ");
            }
        }

        System.out.println(reversedSentence.toString().trim());
    }

    // Custom method to reverse a word
    public static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }

        return reversed.toString();
    }
}