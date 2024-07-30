package Prcatice;

public class CrismassTrees {
    int n;

    public static void treesStrc(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {

                System.out.print(" *");


            }
            System.out.println();

        }
    }

    public static void doubleHill(int n)

    {

        for (int i = 0; i <=n; i++)
        {
            for (int j = i; j <=n; j++)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" *");
            }

            //lowepart
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" ");

            }
            for (int k = i; k <=n ; k++)
            {
                System.out.print("  ");

            }
            for (int j = i; j <=n; j++)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }
    }



        public static void main (String[]args){
            treesStrc(6);
            doubleHill(6);
        }
    }

