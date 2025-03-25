import java.util.Scanner;

public class MultiplesBelow100Finder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            // Loop from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        // Close the Scanner object
        input.close();
    }
}