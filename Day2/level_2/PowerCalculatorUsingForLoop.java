import java.util.Scanner;

public class PowerCalculatorUsingForLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check if both base and power are positive integers
        if (number <= 0 || power <= 0) {
            System.out.println("Please enter positive integers for both base and power.");
        } else {
            int result = 1; // Initialize the result
            // Loop from 1 to the power
            for (int i = 1; i <= power; i++) {
                result *= number; // Multiply the result by the base number
            }
            // Display the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        // Close the Scanner object
        input.close();
    }
}