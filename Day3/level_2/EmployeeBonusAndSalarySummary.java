import java.util.Scanner;

public class EmployeeBonusAndSalarySummary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            // Input validation for salary
            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = input.nextDouble();
                if (salary[i] > 0) {
                    break;
                } else {
                    System.out.println("Invalid salary. Please enter a positive number.");
                }
            }

            // Input validation for years of service
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextInt();
                if (yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                }
            }

            // Calculate total old salary
            totalOldSalary += salary[i];
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Calculate total bonus and total new salary
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + salary[i]);
            System.out.println("  Bonus: " + bonus[i]);
            System.out.println("  New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner object
        input.close();

        // Exit the program
        System.exit(0);
    }
}