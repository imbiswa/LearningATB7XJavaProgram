package NAB;

public class task1 {


    public static int getcount()
    {
        StringBuffer str = new StringBuffer("BAAABAB");
        int deleteA = 0;
        int deleteB = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'B') {
               // countB++;
                if (i == 0) {
                    str.deleteCharAt(i);
                    deleteB++;
                }
            } else if (str.charAt(i) == 'A') {
                //countB++;
                if (i == str.length() - 2) {
                    str.deleteCharAt(i);
                    deleteA++;
                }
            }
        }
        System.out.println(str);
        int B=deleteA+deleteB;
        System.out.println(B);
        return deleteA+deleteB;
    }

    public static int deleteAllA() {
        StringBuffer str = new StringBuffer("BBABAA");
        int deleteA = 0;

        for (int i = 0; i <= str.length() - 1; i++) {

            if (str.charAt(i) == 'B')
            {
                str.deleteCharAt(i);
                deleteA++;
                i--;//beacuae it is deleting every instance , so the index is left back to -1 , so we need do this
            }




        }
        System.out.println(str);
        return deleteA;
    }

    public static int ABCount()
    {
        StringBuffer str = new StringBuffer("AABBB");
        int countA = 0;
        int countB = 0;

        for (int i = 0; i <= str.length()-1; i++)
        {
            if(str.charAt(i)=='A')
            {
                countA++;
            } else if (str.charAt(i)=='B')
            {
               countB++;
            }
        }
        int cnt=0;
        if (countA==countB)
        {
            cnt++;
        }
        else
            cnt=cnt;
            //System.out.println(return 0);

        System.out.println(cnt);
        return cnt;
    }

    public static void main(String[] args) {
        getcount();
        deleteAllA();
        ABCount();


    }
}
