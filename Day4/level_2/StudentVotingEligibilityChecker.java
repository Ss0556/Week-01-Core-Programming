import java.util.Scanner;

public class StudentVotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Input ages of students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check if each student can vote
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " can vote: " + canVote);
            sc.close();
        }
    }

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Check if age is 18 or above
    }
}