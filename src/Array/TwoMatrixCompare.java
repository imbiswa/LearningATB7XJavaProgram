package Array;

import java.util.Arrays;

public class TwoMatrixCompare {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        int b[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };

        for (int i = 0; i <a.length ; i++)

        {
            for (int j = i; j < b.length; j++)
            {

                if(Arrays.deepEquals(b,a))
                {
                    System.out.println("two are equal");

                }
                else
                    System.out.println("not equal");


            }


        }



    }
}
