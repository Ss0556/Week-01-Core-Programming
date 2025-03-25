import java.util.Scanner;

public class YoungestAndTallestFriendFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        String youngest = findYoungest(ages, friends);
        String tallest = findTallest(heights, friends);

        // Display results
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        sc.close();
    }

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] friends) {
        int minAge = ages[0];
        String youngest = friends[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = friends[i];
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] friends) {
        double maxHeight = heights[0];
        String tallest = friends[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = friends[i];
            }
        }
        return tallest;
    }
}