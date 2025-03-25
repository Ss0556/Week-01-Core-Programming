import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate side length
        double side = perimeter / 4;

        // Output the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n",
                side, perimeter);

        // Close the scanner
        scanner.close();
    }
}