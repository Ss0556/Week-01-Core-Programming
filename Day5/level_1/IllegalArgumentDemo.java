import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("IllegalArgumentException Demonstration");
        
        // Get string input from user
        System.out.print("Enter a string: ");
        String inputStr = sc.next();
        
        // Demonstrate exception generation
        System.out.println("\n1. Generating Exception:");
        generateIllegalArgumentException(inputStr);
        
        // Demonstrate exception handling
        System.out.println("\n2. Handling Exception:");
        handleIllegalArgumentException(inputStr);
        
        // Close scanner
        sc.close();
    }

    /**
     * Generates IllegalArgumentException with invalid substring indices
     * @param text Input string
     */
    public static void generateIllegalArgumentException(String text) {
        // Attempt to create substring with start > end
        System.out.println("Substring from 5 to 2: " + text.substring(5, 2));
    }

    /**
     * Handles IllegalArgumentException
     * @param text Input string
     */
    public static void handleIllegalArgumentException(String text) {
        try {
            // Attempt to create substring with start > end
            System.out.println("Substring from 5 to 2: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            // Catch specific exception
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch more general exception
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}