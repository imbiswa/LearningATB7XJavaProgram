package Prcatice;

public class SandGlass
{
    int n;
    public static void glassPartOne(int n)
    {
        for (int i = 1; i <n ; i++)
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
    
    public static void glassPartTwo(int n)
    {
        for (int i = 1; i <=n ; i++) 
        {
            for (int j = i; j <=n ; j++)
            {
                System.out.print(" ");
                
            }
            for (int k = 1; k <=i; k++)
            {
                System.out.print(" *");

            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        glassPartOne(6);
        glassPartTwo(6);

    }
}
