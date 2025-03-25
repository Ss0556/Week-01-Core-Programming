import java.util.Scanner;

public class AthleteTriangleRoundsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate number of rounds for 5 km run
        double rounds = calculateRounds(side1, side2, side3);

        // Output the result
        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");

        sc.close();
    }

    // Method to calculate rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Perimeter of the triangle
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }
}