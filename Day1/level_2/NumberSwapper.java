import java.util.Scanner;

public class NumberSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped numbers
        System.out.printf("The swapped numbers are %d and %d%n",
                number1, number2);

        // Close the scanner
        scanner.close();
    }
}