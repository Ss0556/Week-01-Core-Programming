import java.util.Scanner;

public class FactorFinderUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + ":");
            int i = 1;
            // Loop from 1 to the entered number using a while loop
            while (i <= number) {
                // Check if i is a factor of the number
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
        // Close the Scanner object
        input.close();
    }
}