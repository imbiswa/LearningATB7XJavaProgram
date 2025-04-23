package Practice2025;

import java.util.ArrayList;

public class Array3 {

    public static void main(String[] args) {


        //duplicate


        int [] aar ={1,2,3,4,5,1,2,3};
        ArrayList<Integer> ir = new ArrayList<>();
        for (int i = 0; i < aar.length; i++) {

            if(!ir.contains(aar[i]))
            {
                ir.add(aar[i]);
            }
            else
                System.out.println(aar[i]);

        }

    }
}
