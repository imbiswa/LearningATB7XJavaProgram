package Array;

import java.util.ArrayList;

public class TwoStringArray {

    //String [] ={"biswa","jit", "mallick"}
    //String [] = {"jit","kit", "mit"}
    //outpot ={"jit"}
//opentax
    public static void main(String[] args) {

        String [ ] a1 = {"biswa","jit", "mallick","apple"};
        String [] a2 = {"jit","kit", "mit" ,"apple"};
        ArrayList <String> a3 = new ArrayList<>();

        for (int i = 0; i <=a1.length-1 ; i++)
        {
            for (int j = 0; j <=a2.length-1; j++)
            {
                if(a1[i].contains(a2[j]))
                {
                    a3.add(a1[i]);
                }

            }

        }
        if(a3!=null)
        {
            for (int i = 0; i < a3.size(); i++)
            {
                System.out.print(a3.get(i)+ " " );

            }
        }


    }

}
