import java.util.Scanner;

public class DynamicFactorFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store factors
        int[] factors = new int[10]; // Initial size of 10
        int index = 0; // Index for the array

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, resize it
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2]; // Double the size
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        input.close();
    }
}