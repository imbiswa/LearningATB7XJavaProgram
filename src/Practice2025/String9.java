package Practice2025;

import java.util.Locale;

public class String9 {

    public static void main(String[] args) {

        //Java program to Count Vowels and Consonants in a given

        String str =  "aeioucd";
        getcount(str);


    }

    public static void getcount(String str)
    {
        str= str.toLowerCase(Locale.ROOT);
        int vowels=0 , consult=0;
        for (char c:str.toCharArray()) {
            if(Character.isLetter(c))
            {
                if("aeiou".indexOf(c)!=-1)
                {
                    vowels++;
                }
                else
                    consult++;
            }


        }
        System.out.println("vowels: "+vowels);
        System.out.println("consultant: "+consult);

    }
}
