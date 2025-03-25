import java.util.Scanner;

public class StudentVotingEligibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students

        // Take input for ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Check if age is negative
            if (ages[i] < 0) {
                System.out.println("Invalid age entered. Exiting program.");
                System.exit(0); // Exit the program if age is negative
            }
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        input.close();
    }
}