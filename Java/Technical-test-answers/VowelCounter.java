/* Write a program that counts the number of vowels in a sentence.
eg " Hello World " => returns 2*/
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in the sentence: " + vowelCount);
    }

    private static int countVowels(String str) {
        int count = 0;
        // Convert the entire string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}