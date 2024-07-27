package HomeWork27072024;

public class Highest
{
    public static void main(String[] args) {

        int A[]={1,3,2,0,56,100};
        int temp =0;
        for (int i = 0; i < A.length; i++)
        {
            for (int j = i+1; j < A.length; j++)
            {
                if (A[j]>A[i])
                {
                    temp =A[i];
                    A[i]=A[j];
                    A[j]= temp;

                }


            }

        }


        System.out.println(A[0]);//highest
        System.out.println(A[0+1]);//2nd highest
        System.out.println(A[2]);// 3rd highest


    }
}
