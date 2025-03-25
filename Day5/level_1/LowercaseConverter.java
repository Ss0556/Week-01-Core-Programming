import java.util.Scanner;

public class LowercaseConverter {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Display program title and purpose
        System.out.println("Lowercase Conversion Program");
        System.out.println("This program converts a string to lowercase using two methods:");
        System.out.println("1. Custom implementation with charAt()");
        System.out.println("2. Built-in toLowerCase() method");
        System.out.println("Then compares the results for verification");
        
        // Prompt user to enter a string
        // Using nextLine() to capture entire input including spaces
        System.out.print("\nEnter a string (may include uppercase letters): ");
        String inputStr = sc.nextLine();
        
        // Convert to lowercase using both methods:
        // 1. Our custom implementation
        String customLower = convertToLowercase(inputStr);
        // 2. Java's built-in method
        String builtInLower = inputStr.toLowerCase();
        
        // Display the conversion results
        System.out.println("\nConversion Results:");
        System.out.println("Original string: " + inputStr);
        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        
        // Compare the results of both methods
        boolean comparisonResult = compareUsingCharAt(customLower, builtInLower);
        System.out.println("\nComparison Result:");
        System.out.println("Both methods produce the same output: " + comparisonResult);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }

    /**
     * Converts a string to lowercase using character-by-character processing
     * 
     * @param text The input string to convert to lowercase
     * @return The fully lowercase version of the input string
     */
    public static String convertToLowercase(String text) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();
        
        // Process each character in the input string
        for (int i = 0; i < text.length(); i++) {
            // Get current character
            char currentChar = text.charAt(i);
            
            // Check if character is an uppercase letter (A-Z)
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase using ASCII values:
                // 'A' = 65, 'a' = 97 → difference is 32
                // So adding 32 converts uppercase to lowercase
                currentChar = (char)(currentChar + 32);
            }
            
            // Add the processed character to the result
            result.append(currentChar);
        }
        
        // Return the fully converted string
        return result.toString();
    }

    /**
     * Compares two strings character by character to verify exact match
     * 
     * @param str1 First string to compare
     * @param str2 Second string to compare
     * @return true if strings are identical, false otherwise
     */
    public static boolean compareUsingCharAt(String str1, String str2) {
        // First check if strings have different lengths
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each corresponding character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                // Found a mismatch
                return false;
            }
        }
        
        // All characters matched
        return true;
    }
}