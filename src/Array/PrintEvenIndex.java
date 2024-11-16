package Array;

public class PrintEvenIndex {


    public static void main(String[] args) {


        //Input: {2,3,5,7,8}
        //output: Index1, Index4
        //solved

        int[] a = {2, 3, 5, 7, 8};

        for (int i = 0; i <= a.length - 1; i++)
        {
            int sum=0;
            if(a[i]%2!=0)
            {
                for (int j = i + 1; j <= a.length - 1; j++)
                {
                    sum = a[i]+ a[j];

                    for (int k = 0; k <=a.length-1 ; k++)
                    {
                        if(a[k]==sum)
                        {
                            //System.out.println(k);
                            System.out.println("index"+i+ " "+ "index" +k);
                        }


                    }

                }
            }



        }


    }
}
