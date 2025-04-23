package Practice2025;

import java.util.ArrayList;

public class Array1 {

    public static void main(String[] args) {

//common element of array
        int[] aray1 = {1,2,3,4,5};
        int[] aray2 = {6,7,2,9,8};
        ArrayList<Integer> newar = new ArrayList<>();

        for (int i = 0; i <aray1.length ; i++)
        {
            for (int j = 0; j<aray2.length ; j++) {

                if(aray1[i]==aray2[j])
                {
                    newar.add(aray1[i]);
                }
            }
        }

        System.out.println(newar);
    }
}
