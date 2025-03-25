import java.util.Random;
import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Generate random PCM scores for all students
        int[][] pcmScores = generatePcmScores(numberOfStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(pcmScores);

        // Display the scorecard
        displayScorecard(pcmScores, results);

        sc.close();
    }

    // Method to generate random PCM scores for all students
    public static int[][] generatePcmScores(int numberOfStudents) {
        int[][] pcmScores = new int[numberOfStudents][3];
        Random rand = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            pcmScores[i][0] = rand.nextInt(101); // Physics (0-100)
            pcmScores[i][1] = rand.nextInt(101); // Chemistry (0-100)
            pcmScores[i][2] = rand.nextInt(101); // Math (0-100)
        }

        return pcmScores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] pcmScores) {
        double[][] results = new double[pcmScores.length][3]; // [total, average, percentage]

        for (int i = 0; i < pcmScores.length; i++) {
            int total = pcmScores[i][0] + pcmScores[i][1] + pcmScores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }

        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] pcmScores, double[][] results) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < pcmScores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    pcmScores[i][0] + "\t" +
                    pcmScores[i][1] + "\t\t" +
                    pcmScores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]);
        }
    }
}