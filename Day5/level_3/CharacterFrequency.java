import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int[][] frequencyResult = getCharacterFrequency(input);
        
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyResult.length; i++) {
            if (frequencyResult[i][1] > 0) {
                System.out.println("'" + (char)frequencyResult[i][0] + "': " + frequencyResult[i][1]);
            }
        }
        
        scanner.close();
    }

    public static int[][] getCharacterFrequency(String str) {
        // Array to store frequency of each ASCII character (256 possible)
        int[] charCount = new int[256];
        
        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }
        
        // Count how many unique characters we have
        int uniqueCount = 0;
        for (int count : charCount) {
            if (count > 0) {
                uniqueCount++;
            }
        }
        
        // Create result array
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        
        // Fill result array with character and frequency pairs
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                result[index][0] = i;      // ASCII value
                result[index][1] = charCount[i]; // Frequency
                index++;
            }
        }
        
        return result;
    }
}