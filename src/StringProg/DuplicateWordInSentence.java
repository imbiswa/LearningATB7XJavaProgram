package StringProg;

public class DuplicateWordInSentence {

    public static void main(String[] args) {


        String sen = "Good to know you are good to good";
        String [] words = sen.split(" ");
        String [] duplicatewords ;

        for (int i = 0; i <= words.length-1; i++)
        {
            int count = 1;
            for (int j = i+1; j <= words.length-1; j++)
            {
                if (words[i].equalsIgnoreCase(words[j]))
                {
                    count++;
                    duplicatewords= new String[]{words[i]};
                    System.out.println(duplicatewords);
                }

            }

            if(count>1)
            {
                System.out.println(count);
            }

        }




    }
}
