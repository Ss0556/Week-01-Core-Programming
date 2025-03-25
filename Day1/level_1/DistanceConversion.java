import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceFeet = scanner.nextDouble();

        // Convert to yards and miles
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;

        // Output the results
        System.out.printf("The distance in yards is %.2f and in miles is %.2f%n",
                distanceYards, distanceMiles);

        // Close the scanner
        scanner.close();
    }
}