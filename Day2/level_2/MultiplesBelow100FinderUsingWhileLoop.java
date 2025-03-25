import java.util.Scanner;

public class MultiplesBelow100FinderUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            int counter = number - 1; // Initialize the counter

            // Find multiples using a while loop
            while (counter > 1) {
                // Check if the counter is a multiple of the number
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--; // Decrement the counter
            }
        }

        // Close the Scanner object
        input.close();
    }
}