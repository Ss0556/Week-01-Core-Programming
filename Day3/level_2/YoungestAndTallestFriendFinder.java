import java.util.Scanner;

class YoungestAndTallestFriendFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define arrays to store age and height of 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            height[i] = input.nextDouble();

            // Validate input
            if (age[i] < 0 || height[i] < 0) {
                System.err.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to re-enter values for the same friend
            }
        }

        // Find the youngest friend
        int youngestAge = age[0];
        String youngestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestFriend = friends[i];
            }
        }

        // Find the tallest friend
        double tallestHeight = height[0];
        String tallestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestFriend = friends[i];
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest Friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        // Close the Scanner object
        input.close();
    }
}