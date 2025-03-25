import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.printf("The %.2f fahrenheit is %.2f celsius%n",
                fahrenheit, celsius);

        // Close the scanner
        scanner.close();
    }
}