import java.util.Scanner;

class BMICalculatorArrayVersion{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Define arrays to store height, weight, BMI, and weight status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        // Take input for height and weight of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            // Validate input
            if (height[i] < 0 || weight[i] < 0) {
                System.err.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to re-enter values for the same person
                continue;
            }

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >=18.5 && bmi[i]<=24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >=25   && bmi[i]<=39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + height[i] + " m, Weight = " + weight[i] + " kg, BMI = " + bmi[i] + ", Status = " + status[i]);
        }

        // Close the Scanner object
        input.close();
    }
}