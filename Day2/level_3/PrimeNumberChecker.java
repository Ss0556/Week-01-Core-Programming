import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (>1): ");
        int number = input.nextInt();
        boolean isPrime = true;

        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        // Close the Scanner object
        input.close();
    }
}