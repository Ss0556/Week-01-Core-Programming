import java.util.Scanner;

public class PowerCalculatorUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input for the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        // Get input for the power
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check if both inputs are positive integers
        if (number <= 0 || power <= 0) {
            System.out.println("Please enter positive integers for both base and power.");
        } else {
            int result = 1; // Initialize the result variable
            int counter = 0; // Initialize the counter

            // Calculate the power using a while loop
            while (counter < power) {
                result *= number; // Multiply result by the base number
                counter++; // Increment the counter
            }

            // Print the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        // Close the Scanner object
        input.close();
    }
}