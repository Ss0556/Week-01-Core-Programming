import java.util.Scanner;

public class RecursiveAndFormulaSumCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is natural
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        // Calculate sum using recursion
        int sumRecursive = sumUsingRecursion(n);

        // Calculate sum using formula
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare results
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct.");
        } else {
            System.out.println("Results do not match.");

            sc.close();
        }
    }

    // Method to calculate sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}