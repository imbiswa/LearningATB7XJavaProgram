package StringProg;

import java.util.*;

public class AnagramSeparation {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        List<List<String>> result = new ArrayList<>(anagramMap.values());

        // Print the anagram groups
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
