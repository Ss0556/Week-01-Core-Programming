public class PrimeNeonNumberChecker {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
    }

    // Method to check if a number is Prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is Neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = sumOfDigits(square);
        return sum == number;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}