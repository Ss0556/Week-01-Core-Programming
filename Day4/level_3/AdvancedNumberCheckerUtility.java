public class AdvancedNumberCheckerUtility {
    public static void main(String[] args) {
        int number = 121;
        System.out.println("Is Palindrome: " + isPalindrome(number));
    }

    // Method to check if a number is Palindrome
    public static boolean isPalindrome(int number) {
        int reversed = reverseNumber(number);
        return number == reversed;
    }

    // Method to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}