import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter base (in inches): ");
        double base = scanner.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = scanner.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * base * height;

        // Convert area to square centimeters (1 inch = 2.54 cm)
        double areaCm = areaInches * Math.pow(2.54, 2);

        // Output the results
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters%n",
                areaInches, areaCm);

        // Close the scanner
        scanner.close();
    }
}