import java.util.Scanner;

public class SumOfFirstNNaturalNumbersComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } else {
            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Compare results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);

            if (sumFormula == sumWhile) {
                System.out.println("Both results are correct!");
            } else {
                System.out.println("Results do not match!");
            }
        }

        input.close();
    }
}