package Prcatice;

public class DiamondHollow
{
    int n;
    public static void FirstCap(int n)
    {
        for (int i = 1; i <n ; i++)
        {
            for (int j = i; j <n ; j++)
            {
                System.out.print(" ");

            }
            for (int k = 1; k <i ; k++)
            {
                if(k==1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            for (int l = 1; l <=i ; l++)
            {
                if(l==i)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }


    }
    
    public static void downCap(int n)
    {
        for (int i = 1; i<=n ; i++)
        {
            for (int j = 1; j <i ; j++)
            {
                System.out.print(" ");

            }
            for (int j = i; j <n ; j++)
            {
                if (j==i){
                    System.out.print("*");
                }else
                    System.out.print(" ");

            }
            for (int j = i; j <=n ; j++)
            {
                if (j==n){
                    System.out.print("* ");
                }else
                    System.out.print(" ");

            }


            System.out.println();
        }
    }
    


    public static void main(String[] args)
    {
        FirstCap(5);
        downCap(5);

    }
}
