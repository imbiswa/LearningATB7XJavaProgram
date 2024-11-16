package StringProg;

public class ReverseWord {

    public static void main(String[] args) {
//opentax
        String s1= "India is my country";
        String s2="";

        //output =yrtnuou ym si aidni"

        for (int i = 0; i <= s1.length()-1; i++)
        {
            char c = s1.charAt(i);
            s2=c+s2;



        }
        System.out.println(s2);

    }
}
