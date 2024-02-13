/*Write a program to generate the Fibonacci sequence up to 100*/
public class fibonacciSequence {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;

        System.out.println("Fibonacci sequence up to 100:");
        System.out.print(prev + ", " + next);

        int sum;
        while (true) {
            sum = prev + next;
            if (sum > 100) {
                break;
            }
            System.out.print(", " + sum);
            prev = next;
            next = sum;
        }
    }
}
