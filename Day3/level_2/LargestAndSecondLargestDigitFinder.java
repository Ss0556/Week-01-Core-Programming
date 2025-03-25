import java.util.Scanner;

class LargestAndSecondLargestDigitFinder {
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

        // Define an array to store digits
        int[] digits = new int[10]; // Assuming maximum 10 digits
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Find the largest and second largest digit
        int largest = digits[0];
        int secondLargest = digits[0];
        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        // Close the Scanner object
        input.close();
    }
}