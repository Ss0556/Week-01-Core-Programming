import java.util.Scanner;

class DigitFrequencyCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the input
        if (number < 0) {
            System.err.println("Invalid input. Please enter a non-negative number.");
            input.close();
            System.exit(0);
        }

        // Define an array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of digits:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        // Close the Scanner object
        input.close();
    }
}