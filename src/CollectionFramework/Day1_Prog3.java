package CollectionFramework;

public class Day1_Prog3 {
    public static void main(String[] args) {
        getcount();
    }

    // Count occurrences of each character in a string
    public static void getcount() {
        String str = "aaabb";  // Input string
        boolean[] visited = new boolean[str.length()]; // To track counted characters

        for (int i = 0; i < str.length(); i++)
        {  // Outer loop for each character
            // Skip already counted characters
            if (visited[i]) {//visted i value id by default false
                continue;  // If the character is already processed, skip it
            }

            int count = 1; // Start with 1 to count the current character itself

            for (int j = i + 1; j < str.length(); j++) {  // Inner loop for subsequent characters
                if (str.charAt(i) == str.charAt(j)) {  // Compare characters
                    count++;  // Increment count if characters match
                    visited[j] = true;  // Mark this character as visited
                }
            }

            System.out.println(str.charAt(i) + ": " + count);  // Print the character and its count
        }
    }
}