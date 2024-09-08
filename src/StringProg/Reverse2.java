package StringProg;

public class Reverse2 {
    public static void main(String[] args) {
        //Reverse a string but not the 2nd last character

        String str="Raining";
        String str2="";
        for (int i = 0; i <str.length() ; i++)
        {
            if(i!=str.length()-2)
            {
                str2=str.charAt(i) + str2;
            }
            else {
                str2 = String.valueOf(str.charAt(i));
            }


        }
        System.out.println(str2);
    }
}
