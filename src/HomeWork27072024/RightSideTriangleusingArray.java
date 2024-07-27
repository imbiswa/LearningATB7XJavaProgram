package HomeWork27072024;

public class RightSideTriangleusingArray
{
    public static void main(String[] args) {
        int[][] Triangle= new int[5][5];

        for (int i = 0; i < Triangle.length; i++)
        {
            for (int j = 0; j < Triangle.length; j++)
            {
                if (i>=j)
                {
                    System.out.print("* ");

                }


            }
            System.out.println();

        }
    }
}
