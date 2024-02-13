/* Write a program that takes an integer as input and returns true if the input is a power of two.
Examples: 
8=> returns true
6=> returns false*/
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPowerOfTwo = isPowerOfTwo(number);
        System.out.println("Is the number a power of two? " + isPowerOfTwo);
    }

    private static boolean isPowerOfTwo(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }
}