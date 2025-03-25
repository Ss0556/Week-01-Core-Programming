import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Output the result
        System.out.printf("The %.2f celsius is %.2f fahrenheit%n",
                celsius, fahrenheit);

        // Close the scanner
        scanner.close();
    }
}