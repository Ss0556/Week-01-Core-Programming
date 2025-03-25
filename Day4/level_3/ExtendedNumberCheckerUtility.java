public class ExtendedNumberCheckerUtility
 {
    public static void main(String[] args) {
        int number = 21;
        System.out.println("Is Harshad: " + isHarshad(number));
    }

    // Method to check if a number is Harshad
    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
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