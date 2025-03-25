import java.util.Scanner;

public class MultiplicationTableFrom6To9Array {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results
        int[] multiplicationResult = new int[4]; // For 6 to 9 (4 numbers)

        // Calculate and store the multiplication table from 6 to 9
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multiplicationResult[j] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        input.close();
    }
}