import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();
        
        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();
        
        boolean result = areAnagrams(text1, text2);
        
        System.out.println("\nThe texts \"" + text1 + "\" and \"" + text2 + "\" are " + 
                         (result ? "anagrams!" : "not anagrams."));
        
        scanner.close();
    }

    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();
        
        // Check if lengths are different
        if (text1.length() != text2.length()) {
            return false;
        }
        
        // Create frequency arrays for both texts
        int[] freq1 = new int[256]; // ASCII characters
        int[] freq2 = new int[256];
        
        // Count character frequencies in first text
        for (int i = 0; i < text1.length(); i++) {
            char c = text1.charAt(i);
            freq1[c]++;
        }
        
        // Count character frequencies in second text
        for (int i = 0; i < text2.length(); i++) {
            char c = text2.charAt(i);
            freq2[c]++;
        }
        
        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }
}