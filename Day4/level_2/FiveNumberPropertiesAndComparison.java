import java.util.Scanner;

public class FiveNumberPropertiesAndComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even." : "odd."));
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("First element is greater than the last.");
        } else if (comparison == -1) {
            System.out.println("First element is less than the last.");
        } else {
            System.out.println("First and last elements are equal.");
            sc.close();
        }
    }

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
}