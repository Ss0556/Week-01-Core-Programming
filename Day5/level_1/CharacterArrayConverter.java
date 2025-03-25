import java.util.Scanner;
import java.util.Arrays;

public class CharacterArrayConverter {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Display program title
        System.out.println("Character Array Conversion Program");
        
        // Get string input from user
        System.out.print("Enter a string: ");
        String inputStr = sc.next();
        
        // Convert string to char array using both methods
        char[] customArray = getCharacters(inputStr);
        char[] builtInArray = inputStr.toCharArray();
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Custom array: " + Arrays.toString(customArray));
        System.out.println("Built-in array: " + Arrays.toString(builtInArray));
        System.out.println("Arrays match: " + compareArrays(customArray, builtInArray));
        
        // Close scanner
        sc.close();
    }

    /**
     * Converts string to char array using charAt()
     * @param text Input string
     * @return char array containing all characters from string
     */
    public static char[] getCharacters(String text) {
        // Create array of same length as string
        char[] result = new char[text.length()];
        
        // Fill array character by character
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    /**
     * Compares two char arrays element by element
     * @param arr1 First char array
     * @param arr2 Second char array
     * @return true if arrays are identical, false otherwise
     */
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        // First check array lengths
        if (arr1.length != arr2.length) {
            return false;
        }
        // Compare each element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}