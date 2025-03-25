import java.util.Scanner;

public class NumberFormatDemo {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("NumberFormatException Demonstration");
        
        // Get input that may not be a number
        System.out.print("Enter a number as text: ");
        String inputStr = sc.next();
        
        // Demonstrate exception generation
        System.out.println("\n1. Generating Exception:");
        generateNumberFormatException(inputStr);
        
        // Demonstrate exception handling
        System.out.println("\n2. Handling Exception:");
        handleNumberFormatException(inputStr);
        
        // Close scanner
        sc.close();
    }

    /**
     * Generates NumberFormatException by parsing non-numeric string
     * @param text Input string that may not be a number
     */
    public static void generateNumberFormatException(String text) {
        // Attempt to parse non-numeric string
        System.out.println("Parsed number: " + Integer.parseInt(text));
    }

    /**
     * Handles NumberFormatException
     * @param text Input string that may not be a number
     */
    public static void handleNumberFormatException(String text) {
        try {
            // Attempt to parse non-numeric string
            System.out.println("Parsed number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            // Catch specific exception
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch more general exception
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}