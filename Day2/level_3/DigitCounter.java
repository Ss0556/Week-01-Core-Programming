import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;

        // Count the number of digits
        while (number != 0) {
            number /= 10;
            count++;
        }

        // Display the count of digits
        System.out.println("Number of digits: " + count);
        // Close the Scanner object
        input.close();
    }
}