package StringProg;

public class CountOfDuplicateChar {
    public static void main(String[] args) {

        String s = "abcdab";

        for (int i = 0; i <s.length()-1 ; i++) {
            int count=1;

            for (int j = i+1; j <s.length() ; j++) {

                if(s.charAt(i)==s.charAt(j))
                {
                    count=count+1;
                }

            }
            if(count>1) {
                System.out.println(s.charAt(i) + " found :" + count);
            }
        }

    }
}
