public class PerfectNumberCheck {
    public static void main(String[] args) {
        int number = 28;
        System.out.println("Is Perfect: " + isPerfect(number));
    }

    // Method to check if a number is Perfect
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}