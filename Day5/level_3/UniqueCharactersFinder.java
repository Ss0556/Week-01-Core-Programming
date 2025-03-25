import java.util.Scanner;

public class UniqueCharactersFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int length = findStringLength(input);
        System.out.println("Length of the string: " + length);
        
        char[] uniqueChars = findUniqueCharacters(input, length);
        
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') { // Only print non-null characters
                System.out.print(c + " ");
            }
        }
        
        scanner.close();
    }

    // Method to find the length of the string without using length()
    public static int findStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // We've reached the end of the string
        }
        return length;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String str, int length) {
        char[] allUniqueChars = new char[length]; // Temporary array with maximum possible size
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if this character has appeared before
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to our array
            if (isUnique) {
                allUniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a properly sized array for the result
        char[] result = new char[uniqueCount];
        System.arraycopy(allUniqueChars, 0, result, 0, uniqueCount);
        
        return result;
    }
}