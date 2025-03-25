import java.util.Scanner;

public class EmployeeBonusEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int years = input.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        System.out.println("Bonus amount: " + bonus);
        input.close();
    }
}