import java.util.Scanner;

public class BMICalculatorWithStatus {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Convert height from cm to meters
        height /= 100;
        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI
        System.out.println("BMI: " + bmi);

        // Determine weight status based on BMI
        if (bmi <=18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >=18.5 && bmi <=24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >=25.0 && bmi <=39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
        // Close the Scanner object
        input.close();
    }
}