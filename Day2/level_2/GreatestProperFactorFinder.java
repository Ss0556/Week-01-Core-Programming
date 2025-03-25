import java.util.Scanner;

public class GreatestProperFactorFinder {
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
            // Loop from the number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                // Check if i is a factor of the number
                if (number % i == 0) {
                    greatestFactor = i; // Update the greatest factor
                    break; // Exit the loop once the greatest factor is found
                }
            }
            // Display the greatest factor
            System.out.println("Greatest factor of " + number + " (besides itself): " + greatestFactor);
        }
        // Close the Scanner object
        input.close();
    }
}