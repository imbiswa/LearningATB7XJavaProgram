package StringProg;

import java.util.ArrayList;

public class ExtractIntiger {
    public static void main(String[] args) {
        String st ="hello12 wo3r4ld67";
        ArrayList<Integer> it = new ArrayList<>();
        for (int i = 0; i <st.length() ; i++) {
           if(Character.isDigit(st.charAt(i)))
           {
               int a=Character.getNumericValue(st.charAt(i));
               it.add(a);
           }
        }
        int sum;
       // System.out.println(it);
        for (int i = 0; i <it.size()-1 ; i++)
        {
            for (int j = i+1; j <it.size()-1 ; j++)
            {
                for (int k = j+1; k < it.size()-1; k++)
                {
                    if(it.get(i)+it.get(j)==it.get(k))
                    {
                        System.out.println(it.get(i)+"+"+it.get(j)+"="+(it.get(i)+it.get(j)));

                        System.out.println(it.get(k)+"+"+it.get(k+1)+"="+(it.get(k)+it.get(k+1)));
                    }
                }
            }
        }

        }
    }

