import java.util.Scanner;

public class BMICalculatorWithStatusAndValidation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        if (numberOfPersons <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.exit(0); // Exit if number of persons is invalid
        }

        double[][] personData = new double[numberOfPersons][3]; // [weight, height, BMI]
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            if (personData[i][0] < 0) {
                System.out.println("Invalid weight. Please enter a positive number.");
                i--; // Decrement index to re-enter the value
                continue;
            }

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
            if (personData[i][1] < 0) {
                System.out.println("Invalid height. Please enter a positive number.");
                i--; // Decrement index to re-enter the value
                continue;
            }

            // Calculate BMI
            personData[i][1] /= 100; // Convert height to meters
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] <=18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >=18.5 && personData[i][2]<=24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >=25   && personData[i][2]<=39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + (personData[i][1] * 100) + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
        input.close();
    }
}