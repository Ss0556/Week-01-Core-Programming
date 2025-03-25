import java.util.Scanner;

class StudentGradeCalculatorArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Define arrays to store marks, percentages, grades, and remarks
        int[][] marks = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        String[] remarks = new String[numberOfStudents];

        // Take input for marks of each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            // Validate input
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to re-enter values for the same student
                continue;
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade and remarks based on the provided guidelines
            if (percentages[i] >= 80) {
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }

        // Display results
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics = " + marks[i][0] + ", Chemistry = " + marks[i][1] + ", Maths = " + marks[i][2]);
            System.out.println("  Percentage = " + percentages[i] + "%, Grade = " + grades[i] + ", Remarks = " + remarks[i]);
        }

        // Close the Scanner object
        input.close();
    }
}