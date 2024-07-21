package ex21072024;

public class Pattern3
{
    public static void main(String[] args) {


        int n=5;
        for (int i = 1; i <=n ; i++)
        {

            for (int j = i; j <=n ; j++)
            {
                System.out.print("  ");//here two spaces because one space we are printing and giving a space then
                //another space
            }
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" *");
            }

            for(int j=1;j<i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
