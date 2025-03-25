import java.util.Scanner;

public class MaximumHandshakesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Output the result
        System.out.println("The maximum number of handshakes is: " + maxHandshakes);

        sc.close();
    }

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}