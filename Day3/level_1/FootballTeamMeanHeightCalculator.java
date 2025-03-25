import java.util.Scanner;

public class FootballTeamMeanHeightCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11]; // Array to store heights of 11 players
        double sum = 0.0; // Variable to store the sum of heights

        // Take input for heights of 11 players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in cm): ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Add height to the sum
        }

        // Calculate and display the mean height
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team: " + mean + " cm");
        input.close();
    }
}