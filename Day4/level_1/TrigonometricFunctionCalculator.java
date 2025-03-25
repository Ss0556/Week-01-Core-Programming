import java.util.Scanner;

public class TrigonometricFunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric functions   
        double[] result = calculateTrigonometricFunctions(angle);

        // Output the result
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        sc.close();
    }

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}