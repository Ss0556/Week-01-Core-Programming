import java.util.Scanner;

public class SumOfNaturalNumbersCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculate sum of N natural numbers
        int sum = calculateSum(n);

        // Output the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
    

    // Method to calculate sum of N natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}