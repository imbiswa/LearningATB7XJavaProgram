package Practice2025;
public class String2
{

    public static void main(String[] args)
    {

        //Java program to reverse each word of a given string
        String str = "I am Biswa";
        String[] words = str.split("");
        String reversed = reversethestring(str);
        System.out.println(reversed);
    }

    public static String reversethestring(String sentence)
        {
            String [] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++)
            {
                    words[i]= reversingEachWord(words[i]);
            }
            return String.join(" ",words);
        }

    public static String reversingEachWord(String word)
    {
        char[] chars = word.toCharArray();
        for (int left = 0, right = chars.length-1; left<right; left++, right--)
        {
            char temp = chars[left];
            chars[left]= chars[right];
            chars[right]= temp;
        }
        return new String(chars);
    }

}
