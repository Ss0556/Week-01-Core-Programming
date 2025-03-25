import java.util.Scanner;

public class PoundsToKilogramsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Convert to kilograms
        double weightKg = weightPounds / 2.2;

        // Output the result
        System.out.printf("The weight in kilograms is %.2f kg%n",
                weightKg);

        // Close the scanner
        scanner.close();
    }
}