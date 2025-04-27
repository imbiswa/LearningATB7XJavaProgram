package Practice2025;

public class ReverseWords2 {

    public static void main(String[] args) {

        String sentence = "This is a tcs interview";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            if(word.equalsIgnoreCase("tcs")||word.equalsIgnoreCase("a"))
            {
                sb.append(word).append(" ");
            }else
            {
                sb.append(reverseString(word)).append(" ");
            }

        }
        System.out.println(sb);


    }

    public static String reverseString(String word)
    {
        String reversed ="";
        for (int i = 0; i <word.length() ; i++) {
            char c = word.charAt(i);
            reversed= c+reversed;
        }
        return reversed.toString();

    }


}
