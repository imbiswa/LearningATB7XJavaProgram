package NumberProgram;

public class Fibonacci {

    public static void main(String[] args) {
        //0,1,2,3,4,5
        //0+1=1
        //1+1=2
        int n1=0;
        int n2=1;
        int n3;
        int i;
        int count=0;


        System.out.print(n1+","+n2);

        for (i = 0; i <=20 ; i++)
        {
            n3=n1+n2;
            System.out.print(","+n3);
            n1=n2;
            n2=n3;



        }
    }


    }

