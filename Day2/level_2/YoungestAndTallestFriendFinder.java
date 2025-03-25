import java.util.Scanner;

public class YoungestAndTallestFriendFinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input ages and heights of Amar, Akbar, and Anthony
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        // Find the youngest friend
        String youngest = (amarAge <= akbarAge && amarAge <= anthonyAge) ? "Amar" :
                          (akbarAge <= amarAge && akbarAge <= anthonyAge) ? "Akbar" : "Anthony";

        // Find the tallest friend
        String tallest = (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) ? "Amar" :
                         (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) ? "Akbar" : "Anthony";

        // Display the results
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        // Close the Scanner object
        input.close();
    }
}