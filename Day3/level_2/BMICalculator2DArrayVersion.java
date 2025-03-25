import java.util.Scanner;

class BMICalculator2DArrayVersion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Define a 2D array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();

            // Validate input
            if (personData[i][0] < 0 || personData[i][1] < 0) {
                System.err.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to re-enter values for the same person
                continue;
            }

            // Calculate BMI and store it in the array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] <=18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >=18.5 && personData[i][2]<=24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >=25.0 && personData[i][2]<=39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + personData[i][0] + " kg, Height = " + personData[i][1] + " m, BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }

        // Close the Scanner object
        input.close();
    }
}