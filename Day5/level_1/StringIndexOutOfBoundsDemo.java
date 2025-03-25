import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("StringIndexOutOfBoundsException Demonstration");
        
        // Get string input from user
        System.out.print("Enter a string: ");
        String inputStr = sc.next();
        
        // Demonstrate exception generation
        System.out.println("\n1. Generating Exception:");
        generateStringIndexException(inputStr);
        
        // Demonstrate exception handling
        System.out.println("\n2. Handling Exception:");
        handleStringIndexException(inputStr);
        
        // Close scanner
        sc.close();
    }

    /**
     * Generates StringIndexOutOfBoundsException by accessing invalid index
     * @param text Input string
     */
    public static void generateStringIndexException(String text) {
        // Attempt to access character beyond string length
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    /**
     * Handles StringIndexOutOfBoundsException
     * @param text Input string
     */
    public static void handleStringIndexException(String text) {
        try {
            // Attempt to access character beyond string length
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and handle the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}