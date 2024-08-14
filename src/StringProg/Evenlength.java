package StringProg;

public class Evenlength
{
    public static void main(String[] args)
    {
        String s ="i am a boy and am have";
        String [] Ar =s.split(" ");

        for (int i = 0; i <Ar.length ; i++)
        {
            int count=0;

            for (int j = 0; j <Ar[i].length() ; j++)
            {

                count++;


            }
            if (count % 2 ==0)
            {
                System.out.println("Even count strings are :even  "+Ar[i]);
            } else
            {
                System.out.println("Even count strings are :odd  "+Ar[i]);
            }


        }

    }
}
