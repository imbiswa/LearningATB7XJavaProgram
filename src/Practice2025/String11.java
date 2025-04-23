package Practice2025;

public class String11 {

    public static void main(String[] args) {

        String str = "abc451";
        int sum=0;


        for (int i = 0; i <str.length() ; i++)
        {

            if(Character.isDigit(str.charAt(i)))
            {

                sum =sum+ Integer.parseInt(String.valueOf(str.charAt(i)));


            }


        }
        System.out.println(sum);
    }
}
