package Prcatice;

public class HollowSandglass
{
    int n;
    public static void upeer(int n)
    {
        for (int i = 1; i <n ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print("  ");
            }
            for (int j = i; j <n ; j++)
            {
                if (j==i || i==1)
                {
                    System.out.print(" *");
                }
                else
                    System.out.print("  ");
            }
            for (int j = i; j <=n ; j++)
            {
                if (j==n || i==1)
                {
                    System.out.print(" *");
                }
                else
                    System.out.print("  ");

            }
            System.out.println();

        }


    }
    public static void down(int n)
    {
        for (int i = 1; i <=n ; i++)
        {
            for (int j = i; j <=n ; j++)
            {
                System.out.print("  ");

            }
            for (int j = 1; j <i ; j++)
            {
                if (j==1 || i==n)
                {
                    System.out.print(" *");

                }
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++)
            {
                if (j==i || i==n)
                {
                    System.out.print(" *");

                }
                else
                    System.out.print("  ");
            }
            System.out.println();







        }

    }



















    public static void main(String[] args) {
        upeer(5);
        down(5);

    }
}
