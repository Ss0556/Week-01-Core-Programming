import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter unit price (INR): ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n",
                totalPrice, quantity, unitPrice);

        // Close the scanner
        scanner.close();
    }
}