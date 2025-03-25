import java.util.Scanner;

public class AthleteRunningRoundsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter side1 (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Calculate number of rounds for 5 km
        double totalDistance = 5000; // 5 km in meters
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n",
                rounds);

        // Close the scanner
        scanner.close();
    }
}