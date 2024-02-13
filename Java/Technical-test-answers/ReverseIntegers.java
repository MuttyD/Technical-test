/*Write a program that takes an integer as input and returns an integer with reversed digit 
ordering.
Examples:
For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19.*/
import java.util.Scanner;

public class ReverseIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    private static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit; 
            number /= 10; 
        }
        return reversed;
    }
}