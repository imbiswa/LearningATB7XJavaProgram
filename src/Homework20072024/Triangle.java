package Homework20072024;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first slide of the triangle");
        int a = sc.nextInt();

        System.out.println("Enter the first slide of the triangle");
        int b = sc.nextInt();

        System.out.println("Enter the first slide of the triangle");
        int c = sc.nextInt();

        if ((a==b)&&(b==c))
        {
            System.out.println("Triangle is equilateral");
        }
        else if ((a==b)||(b==c)||(c==a))
        {
            System.out.println("isosceles");
        }
        else
            System.out.println("scalene");

    }
}
