package Practice2025;

import java.util.ArrayList;
import java.util.HashMap;

public class Array5 {
// count of dupicate element, it has time complexity O(n)
    public static void main(String[] args) {


        int [] arr= {1,2,3,4,5,1,2,2,7,8,9,0,0,2,3,4,5,6,7,8,9};
        HashMap<Integer,Integer> elementCount = new HashMap<>();

        for(int num: arr)
        {
            elementCount.put(num,elementCount.getOrDefault(num,0)+1);
        }

        for(int key: elementCount.keySet())
        {

                System.out.println(key+" found->"+elementCount.get(key)+ " times");

        }

    }
}
