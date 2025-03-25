public class NumberCheckerUtility {
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Is Armstrong: " + isArmstrong(number));
        System.out.println("Is Duck: " + isDuck(number));
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = countDigits(number);
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Method to check if a number is Duck
    public static boolean isDuck(int number) {
        while (number != 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}