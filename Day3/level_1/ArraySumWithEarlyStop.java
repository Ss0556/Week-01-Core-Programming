import java.util.Scanner;

public class ArraySumWithEarlyStop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        double total = 0.0; // Variable to store the sum of numbers
        int index = 0; // Index for the array

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (num <= 0) {
                break;
            }

            // Break the loop if the array is full
            if (index == 10) {
                System.out.println("Array is full. Exiting input loop.");
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = num;
            index++;
        }

        // Calculate the sum of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal: " + total);
        input.close();
    }
}