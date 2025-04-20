package NumberProgram;

import java.util.Scanner;

public class ReverseFirstLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Getting the last digit
        int lastDigit = number % 10;

        // Getting the first digit
        int temp = number;
        while (temp >= 10) {
            temp /= 10;
        }
        int firstDigit = temp;

        // Remove the first and last digits from the original number
        int middlePart = (number % (int) Math.pow(10, (int) Math.log10(number))) / 10;

        // Create the new number with the first and last digits swapped
        int reversedNumber = lastDigit * (int) Math.pow(10, (int) Math.log10(number)) + middlePart * 10 + firstDigit;

        System.out.println("Number after swapping first and last digit: " + reversedNumber);
    }
}
