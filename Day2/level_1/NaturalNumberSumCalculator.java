import java.util.Scanner;

public class NaturalNumberSumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate the sum of the first n natural numbers using the formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number, print an error message
            System.out.println("The number " + number + " is not a natural number.");
        }
        
        // Close the Scanner object
        input.close();
    }
}