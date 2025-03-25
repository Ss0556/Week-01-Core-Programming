import java.util.Scanner;

public class UppercaseConverter {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("Uppercase Conversion Program");
        
        // Get string input from user (using nextLine for complete input)
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        
        // Convert to uppercase using both methods
        String customUpper = convertToUppercase(inputStr);
        String builtInUpper = inputStr.toUpperCase();
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Strings match: " + compareUsingCharAt(customUpper, builtInUpper));
        
        // Close scanner
        sc.close();
    }

    /**
     * Converts string to uppercase using charAt() and ASCII values
     * @param text Input string
     * @return Uppercase version of input string
     */
    public static String convertToUppercase(String text) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();
        
        // Process each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if character is lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase using ASCII values
                c = (char)(c - 32);
            }
            result.append(c);
        }
        return result.toString();
    }

    /**
     * Compares two strings character by character
     * @param str1 First string
     * @param str2 Second string
     * @return true if strings are identical, false otherwise
     */
    public static boolean compareUsingCharAt(String str1, String str2) {
        // First check string lengths
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}