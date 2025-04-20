package NAB;

public class task3 {


        public static String removeChar(String s) {
            if (s == null || s.length() == 0) {
                return s;
            }

            int len = s.length();
            for (int i = 0; i < len - 1; i++) {
                if (s.charAt(i) > s.charAt(i + 1)) {
                    return s.substring(0, i) + s.substring(i + 1);
                }
            }

            // If no characters were removed in the loop, remove the last character
            return s.substring(0, len - 1);
        }

        public static void main(String[] ar) {
            String str = "abc";
            System.out.println(removeChar(str)); // Output: ab
        }


}
