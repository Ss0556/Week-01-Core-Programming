import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result
        System.out.printf("The maximum number of handshakes among %d students is %d%n",
                numberOfStudents, handshakes);

        // Close the scanner
        scanner.close();
    }
}