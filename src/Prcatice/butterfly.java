package Prcatice;

public class butterfly {



    public static void upperButterfly()
    {
        for (int i = 1; i <=6; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" *");

            }
            for (int j = i; j <6 ; j++)
            {
                System.out.print("   ");
            }


            for (int k = i; k <6 ; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <=i ; l++)
            {
                System.out.print("* ");

            }


            System.out.println("");

        }
    }

    public static void lowerbuterpart()
    {

        for (int i = 1; i <=6 ; i++)
        {
            for (int j = i; j <6 ; j++)
            {
                System.out.print(" *");

            }
            for (int j = 1; j <=i ; j++)
            {
                System.out.print("  ");
            }

            for (int k = 1; k <=i ; k++)
            {
                System.out.print("  ");

            }
            for (int l = i; l <6 ; l++)
            {
                System.out.print("* ");


            }

            System.out.println();

        }
    }






    public static void main(String[] args) {
        upperButterfly();
        lowerbuterpart();



    }





}
