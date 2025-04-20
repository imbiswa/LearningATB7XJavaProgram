package AdhocPractice;

public class printTriangle


{
    public static void getup(int a)
    {
        for(int i =0 ;i<=a;i++)
        {

            for (int j = i; j <=a ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void getdown(int b)
    {
        for (int i = 0; i <=b ; i++)
        {
            for (int j = i; j <=1 ; j++)

            {
                System.out.print(" ");

            }
            for (int j = i; j <=b ; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        getup(5);
        getdown(5);





    }
}
