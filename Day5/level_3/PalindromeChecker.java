import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text to check for palindrome: ");
        String input = scanner.nextLine();
        
        // Using Logic 1: Two-pointer approach
        boolean isPalindrome1 = isPalindromeTwoPointer(input);
        System.out.println("\nUsing two-pointer approach: " + 
                         (isPalindrome1 ? "It's a palindrome!" : "Not a palindrome."));
        
        // Using Logic 2: Recursive approach
        boolean isPalindrome2 = isPalindromeRecursive(input, 0, input.length()-1);
        System.out.println("Using recursive approach: " + 
                         (isPalindrome2 ? "It's a palindrome!" : "Not a palindrome."));
        
        // Using Logic 3: Reverse array approach
        boolean isPalindrome3 = isPalindromeReverseArray(input);
        System.out.println("Using reverse array approach: " + 
                         (isPalindrome3 ? "It's a palindrome!" : "Not a palindrome."));
        
        scanner.close();
    }

    // Logic 1: Two-pointer approach
    public static boolean isPalindromeTwoPointer(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive approach
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case: we've checked all character pairs
        if (start >= end) {
            return true;
        }
        
        // If characters don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive case: check next pair of characters
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Reverse array approach
    public static boolean isPalindromeReverseArray(String str) {
        // Create original and reversed character arrays
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str).toCharArray();
        
        // Compare each character
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    
    // Helper method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}