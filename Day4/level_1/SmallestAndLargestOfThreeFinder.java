import java.util.Scanner;

public class SmallestAndLargestOfThreeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        // Find smallest and largest
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Output the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close();
    }

    // Method to find smallest and largest
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);
        return new int[]{smallest, largest};
    }
}