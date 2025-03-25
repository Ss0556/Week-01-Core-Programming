import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10;
            originalNumber /= 10;
        }

        // Check if the number is a Harshad number
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
        // Close the Scanner object
        input.close();
    }
}