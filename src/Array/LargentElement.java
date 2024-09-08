package Array;

import java.util.Scanner;

public class LargentElement {
    public static void main(String[] args) {
        int [] arr= new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array values");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();

        }
        int temp =0;


        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j < arr.length ; j++) {

                if(arr[i]>arr[j])
                {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "");
        }
        System.out.println(arr[arr.length-1]);


    }
}
