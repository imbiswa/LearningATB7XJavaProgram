package NumberProgram;

import java.util.ArrayList;
import java.util.Scanner;
//not completed
public class NextPlaindraom {
    public static void main(String[] args) {
        int n = 111;
        ArrayList<Integer> ar = new ArrayList<>();
        while (true)
        {
            int temp = n;
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum)
            {

                if (!ar.contains(sum))
                {

                    ar.add(sum);
                    if (ar.size() == 1)
                    {
                        System.out.println(ar.get(0));
                    }

                }

            } //else

            n=n+1;


        }

    }

    }

