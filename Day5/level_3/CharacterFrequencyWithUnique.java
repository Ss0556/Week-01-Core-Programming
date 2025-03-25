import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Step 1: Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);
        
        // Step 2: Get frequency of each unique character
        String[][] frequencyResult = getCharacterFrequency(input, uniqueChars);
        
        // Display results
        System.out.println("\nCharacter frequencies:");
        System.out.println("----------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        
        for (String[] entry : frequencyResult) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }
        
        System.out.println("----------------------");
        scanner.close();
    }

    // Method to find unique characters using nested loops
    public static char[] findUniqueCharacters(String str) {
        char[] allChars = new char[str.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            
            // Check if we've seen this character before
            for (int j = 0; j < uniqueCount; j++) {
                if (allChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            // If unique, add to our array
            if (isUnique) {
                allChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        // Create properly sized array for the result
        char[] result = new char[uniqueCount];
        System.arraycopy(allChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to get frequency of each unique character
    public static String[][] getCharacterFrequency(String str, char[] uniqueChars) {
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int count = 0;
            
            // Count occurrences of this character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            // Store character and its frequency
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(count);
        }
        
        return result;
    }
}