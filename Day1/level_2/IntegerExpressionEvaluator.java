import java.util.Scanner;

public class IntegerExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, c
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        // Perform integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output the results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n",
                result1, result2, result3, result4);

        // Close the scanner
        scanner.close();
    }
}