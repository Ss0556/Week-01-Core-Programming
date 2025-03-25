import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("String Comparison Program");
        
        // Get first string input from user
        System.out.print("Enter first string: ");
        String firstStr = sc.next();
        
        // Get second string input from user
        System.out.print("Enter second string: ");
        String secondStr = sc.next();
        
        // Compare strings using custom charAt method and built-in equals
        boolean charAtResult = compareUsingCharAt(firstStr, secondStr);
        boolean equalsResult = firstStr.equals(secondStr);
        
        // Display comparison results
        System.out.println("\nComparison Results:");
        System.out.println("Using charAt(): " + charAtResult);
        System.out.println("Using equals(): " + equalsResult);
        System.out.println("Results match: " + (charAtResult == equalsResult));
        
        // Close scanner to prevent resource leak
        sc.close();
    }

    /**
     * Compares two strings character by character using charAt()
     * @param str1 First string to compare
     * @param str2 Second string to compare
     * @return true if strings are identical, false otherwise
     */
    public static boolean compareUsingCharAt(String str1, String str2) {
        // First check if lengths are different
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