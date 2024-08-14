package StringProg;

public class Rotation {
    public static void main(String[] args) {


        String s = "abcd1abcd";


        String rot1 = "";
        String rot2 = "";

        for (int i = 0; i < s.length() / 2; i++)
        {

            rot1=s.charAt(i)+rot1;
        }
        System.out.println(rot1);
        for (int i = s.length()/2; i <s.length() ; i++)
        {
            rot2=s.charAt(i)+rot2;
        }
        System.out.println(rot2);

        if(rot1.equals(rot2))

        {
            System.out.println("string is rotation");
        }
        else
            System.out.println("not rotation");
    }



}
