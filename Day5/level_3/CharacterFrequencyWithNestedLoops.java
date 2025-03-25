import java.util.Scanner;

public class CharacterFrequencyWithNestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[] frequencyResult = getCharacterFrequency(input);
        
        System.out.println("\nCharacter frequencies:");
        System.out.println("----------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        
        for (String entry : frequencyResult) {
            if (entry != null) {
                String[] parts = entry.split(":");
                System.out.printf("%-10s %-10s%n", parts[0], parts[1]);
            }
        }
        
        System.out.println("----------------------");
        scanner.close();
    }

    public static String[] getCharacterFrequency(String str) {
        char[] characters = str.toCharArray();
        int[] frequency = new int[characters.length];
        String[] result = new String[characters.length];
        int resultIndex = 0;
        
        for (int i = 0; i < characters.length; i++) {
            // Skip if this character was already counted
            if (characters[i] == '0') {
                continue;
            }
            
            // Initialize frequency for this character
            frequency[i] = 1;
            
            // Compare with remaining characters
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    // Mark duplicate as counted
                    characters[j] = '0';
                }
            }
            
            // Store result only for original characters (not '0')
            if (characters[i] != '0') {
                result[resultIndex++] = characters[i] + ":" + frequency[i];
            }
        }
        
        // Create properly sized array
        String[] finalResult = new String[resultIndex];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);
        return finalResult;
    }
}
