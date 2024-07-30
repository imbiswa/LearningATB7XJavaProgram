package Prcatice;

public class Diamond {

int n=10;


    // *
    //*  *
    //*  *  *
    public static void upperpart(int n)
    {
        for (int i = 1; i <n; i++)//i<=n will give a parttern having 2 bases
        {
            for (int j = i; j <=n; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++)
            {
                System.out.print(" *");

            }
            System.out.println();

        }
    }
    public static void lowerPart(int n)
    {

        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" ");

            }
            for (int k = i; k <=n ; k++)
            {
                System.out.print(" *");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        upperpart(6);
        lowerPart(6);



    }




    }



