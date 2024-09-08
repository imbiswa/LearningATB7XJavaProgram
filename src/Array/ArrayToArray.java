package Array;

public class ArrayToArray {
    public static void main(String[] args) {


        int a [] ={1,2,3,4};
        int b [] =new int [4];

        for (int i = 0; i <a.length ; i++) {

            for (int j = i; j < b.length; j++) {

                b[j] =a[i];

            }
        }


        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");

        }


    }
}
