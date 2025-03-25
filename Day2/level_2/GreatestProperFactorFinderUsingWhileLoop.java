import java.util.Scanner;

public class GreatestProperFactorFinderUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // Initialize the greatest factor
            int counter = number - 1; // Start checking from the number - 1
            // Loop until counter reaches 1
            while (counter >= 1) {
                // Check if counter is a factor of the number
                if (number % counter == 0) {
                    greatestFactor = counter; // Update the greatest factor
                    break; // Exit the loop once the greatest factor is found
                }
                counter--; // Decrement the counter
            }
            // Display the greatest factor
            System.out.println("Greatest factor of " + number + " (besides itself): " + greatestFactor);
        }
        // Close the Scanner object
        input.close();
    }
}