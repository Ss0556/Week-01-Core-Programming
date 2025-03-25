import java.util.Scanner;

public class SalaryBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and bonus
        System.out.print("Enter salary (INR): ");
        double salary = scanner.nextDouble();
        System.out.print("Enter bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Output the result
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f%n",
                salary, bonus, totalIncome);

        // Close the scanner
        scanner.close();
    }
}