import java.util.Scanner;

public class SumOfFirstNNaturalNumbersFormulaForLoopCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } else {
            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Compare results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);

            if (sumFormula == sumFor) {
                System.out.println("Both results are correct!");
            } else {
                System.out.println("Results do not match!");
            }
        }

        input.close();
    }
}