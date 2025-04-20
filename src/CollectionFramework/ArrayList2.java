package CollectionFramework;
import StringProg.ExtractIntiger;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ar.add(i);
        }
        ar.add(2);
        System.out.println(ar);
        HashMap <Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"IND");
        hm.put(2,"MAR");
        System.out.println(hm);
        Set<Integer> hs = new HashSet<Integer>(ar.size());
        System.out.println(hs);
    }
}
