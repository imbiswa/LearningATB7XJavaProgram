package HomeWork27072024;

import java.util.Scanner;

public class Arrymax
{
    public static void main(String[] args) {

        int [] A= new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++)
        {
            System.out.println("enter till 5 digit for" );
            int a = sc.nextInt();
            A[i]=a;
        }



        int max=0;
        for (int i = 0; i < A.length; i++)
        {
            System.out.println(A[i]);
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println(max);


        System.out.println(A[A.length-1]);
    }
}
