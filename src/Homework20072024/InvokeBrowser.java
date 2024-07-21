package Homework20072024;

import java.util.Scanner;

public class InvokeBrowser {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the browser name: ");
        String browser = sc.next();

        switch (browser)
        {
            case "chrome":
            {
                System.out.println("running chrome");
                break;
            }
            case "IE","headless":
            {
                System.out.println("running IE");
                break;
            }
            case "firefox","FHL":
            {
                System.out.println("running firefox");
                break;
            }
            default:
                System.out.println("no idea");
        }

    }
}
