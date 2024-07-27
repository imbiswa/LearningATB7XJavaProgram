package HomeWork27072024;

public class leftTriangleStarArray
{
    public static void main(String[] args) {

        int[][] Triangle= new int[5][5];

        for (int i = 0; i < Triangle.length; i++)
        {
            for (int j = 0; j < Triangle.length; j++)
            {
                if (j>=i)
                {
                    System.out.print("* ");

                }


            }
            System.out.println();

        }
    }
}
