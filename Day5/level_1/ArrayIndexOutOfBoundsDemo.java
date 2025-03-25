import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("ArrayIndexOutOfBoundsException Demonstration");
        
        // Get array size from user
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        
        // Create array of specified size
        String[] names = new String[size];
        
        // Fill array with user input
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        
        // Demonstrate exception generation
        System.out.println("\n1. Generating Exception:");
        generateArrayIndexException(names);
        
        // Demonstrate exception handling
        System.out.println("\n2. Handling Exception:");
        handleArrayIndexException(names);
        
        // Close scanner
        sc.close();
    }

    /**
     * Generates ArrayIndexOutOfBoundsException by accessing invalid index
     * @param arr Input array
     */
    public static void generateArrayIndexException(String[] arr) {
        // Attempt to access element beyond array bounds
        System.out.println("Element at index 100: " + arr[100]);
    }

    /**
     * Handles ArrayIndexOutOfBoundsException
     * @param arr Input array
     */
    public static void handleArrayIndexException(String[] arr) {
        try {
            // Attempt to access element beyond array bounds
            System.out.println("Element at index 100: " + arr[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch specific exception
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch more general exception
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}