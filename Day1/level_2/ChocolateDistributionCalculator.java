import java.util.Scanner;

public class ChocolateDistributionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of chocolates and children
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the result
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d%n",
                chocolatesPerChild, remainingChocolates);

        // Close the scanner
        scanner.close();
    }
}