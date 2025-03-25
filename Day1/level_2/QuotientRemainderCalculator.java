import java.util.Scanner;

public class QuotientRemainderCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output the results
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n",
                quotient, remainder, number1, number2);

        // Close the scanner
        scanner.close();
    }
}