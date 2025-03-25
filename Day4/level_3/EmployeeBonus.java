import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] employees = new double[10][2];
        Random rand = new Random();
 
        for (int i = 0; i < 10; i++) {
            employees[i][0] = rand.nextInt(90000) + 10000; // Random salary between 10000 and 99999
            employees[i][1] = rand.nextInt(20) + 1; // Random years of service between 1 and 20
        }

        double[][] updatedSalaries = calculateBonus(employees);
        displayResults(employees, updatedSalaries);
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(double[][] employees) {
        double[][] updatedSalaries = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = employees[i][1] > 5 ? employees[i][0] * 0.05 : employees[i][0] * 0.02;
            updatedSalaries[i][0] = employees[i][0] + bonus;
            updatedSalaries[i][1] = bonus;
        }
        return updatedSalaries;
    }

    // Method to display results
    public static void displayResults(double[][] employees, double[][] updatedSalaries) {
        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t\t" + employees[i][0] + "\t\t" + updatedSalaries[i][0] + "\t\t" + updatedSalaries[i][1]);
        }
    }
}