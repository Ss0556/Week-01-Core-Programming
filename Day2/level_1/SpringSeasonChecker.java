import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();
        
        // Check if the date falls within the Spring season (March 20 to June 20)
        boolean isSpring = (month == 3 && day >= 20) || 
                           (month > 3 && month < 6) || 
                           (month == 6 && day <= 20);
        
        // Print the result
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
        
        // Close the Scanner object
        input.close();
    }
}