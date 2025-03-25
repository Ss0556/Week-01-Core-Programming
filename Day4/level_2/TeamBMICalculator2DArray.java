import java.util.Scanner;

public class TeamBMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 members
        double[][] teamData = new double[10][3];

        // Input weight and height for each member
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for member " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (in cm) for member " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI and determine status
        calculateBMI(teamData);
        String[] status = determineBMIStatus(teamData);

        // Display results
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) + ":");
            System.out.println("Height: " + teamData[i][1] + " cm, Weight: " + teamData[i][0] + " kg");
            System.out.println("BMI: " + teamData[i][2] + ", Status: " + status[i]);
            System.out.println();

            sc.close();
        }
    }

    // Method to calculate BMI
    public static void calculateBMI(double[][] teamData) {
        for (int i = 0; i < teamData.length; i++) {
            double heightInMeters = teamData[i][1] / 100; // Convert cm to meters
            teamData[i][2] = teamData[i][0] / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] teamData) {
        String[] status = new String[10];
        for (int i = 0; i < teamData.length; i++) {
            double bmi = teamData[i][2];
            if (bmi <=18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.4 && bmi <=24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <=39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}