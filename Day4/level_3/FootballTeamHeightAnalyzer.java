import java.util.Random;

public class FootballTeamHeightAnalyzer {
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        int sum = sumOfHeights(heights);
        double mean = meanHeight(sum, heights.length);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }

    // Method to generate random heights
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // Random height between 150 and 250
        }
        return heights;
    }

    // Method to calculate sum of heights
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double meanHeight(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find shortest height
    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}