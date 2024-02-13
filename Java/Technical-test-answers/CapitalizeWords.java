/*Write a program that accepts a string as input, capitalizes the first letter of each word in the 
string, and then returns the result string.
Examples: 
"hi"=> returns "Hi"
"i love programming"=> returns "I Love Programming"*/
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String resultString = capitalizeWords(inputString);
        System.out.println("Capitalized string: " + resultString);
    }

    private static String capitalizeWords(String str) {
        StringBuilder result = new StringBuilder(str.length());
        String[] words = str.split("\\s");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}
