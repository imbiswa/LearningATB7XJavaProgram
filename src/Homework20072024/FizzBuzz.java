package Homework20072024;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("fuzzbuzz, ");
            }
            if (i % 3 != 0 && i % 5 != 0)
            {
                System.out.print(i+", ");
            }
           if(i%3==0)
            {
                System.out.print("fuzz, ");
            }
            if(i%5==0)
            {
                System.out.print("buzz, ");
            }



        }
    }
}
