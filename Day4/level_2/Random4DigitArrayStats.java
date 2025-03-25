import java.util.Arrays;

public class Random4DigitArrayStats {
    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display generated numbers
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max
        double[] results = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    // Method to generate 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Random number between 1000 and 9999
        }
        return numbers;
    }

    // Method to find average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}