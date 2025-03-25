import java.util.Scanner;

public class SumOfPositiveNumbersUntilNonPositiveInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers (enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            if (number <= 0) {
                break; // Exit the loop if the number is 0 or negative
            }

            total += number; // Add the number to the total
        }

        System.out.println("The sum of the numbers is: " + total);
        input.close();
    }
}