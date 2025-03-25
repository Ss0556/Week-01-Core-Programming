import java.util.Scanner;

public class SumOfNumbersUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        double total = 0.0; // Initialize the total sum to 0
        double number; // Variable to store user input
        
        // Use a while loop to repeatedly take input until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }
            total += number; // Add the number to the total
        }
        
        // Print the total sum
        System.out.println("The sum of the numbers is: " + total);
        
        // Close the Scanner object
        input.close();
    }
}