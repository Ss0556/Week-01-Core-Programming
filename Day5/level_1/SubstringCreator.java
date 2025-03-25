import java.util.Scanner;

public class SubstringCreator {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("Substring Creation Program");
        
        // Get string input from user
        System.out.print("Enter a string: ");
        String inputStr = sc.next();
        
        // Get start index for substring
        System.out.print("Enter start index: ");
        int startIdx = sc.nextInt();
        
        // Get end index for substring
        System.out.print("Enter end index: ");
        int endIdx = sc.nextInt();
        
        try {
            // Create substring using both methods
            String customSub = createSubstring(inputStr, startIdx, endIdx);
            String builtInSub = inputStr.substring(startIdx, endIdx);
            
            // Display results
            System.out.println("\nResults:");
            System.out.println("Custom substring: " + customSub);
            System.out.println("Built-in substring: " + builtInSub);
            System.out.println("Substrings match: " + compareUsingCharAt(customSub, builtInSub));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle invalid index cases
            System.out.println("Error: Invalid indices for substring operation.");
        }
        
        // Close scanner
        sc.close();
    }

    /**
     * Creates substring using charAt() method
     * @param text Original string
     * @param start Starting index (inclusive)
     * @param end Ending index (exclusive)
     * @return Substring created using charAt()
     * @throws StringIndexOutOfBoundsException if indices are invalid
     */
    public static String createSubstring(String text, int start, int end) {
        // Validate indices
        if (start < 0 || end > text.length() || start > end) {
            throw new StringIndexOutOfBoundsException();
        }
        
        // Build substring character by character
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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
        // First check lengths
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