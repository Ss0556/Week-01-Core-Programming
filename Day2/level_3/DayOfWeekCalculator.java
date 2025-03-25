import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Adjust month and year for the formula
        if (m < 3) {
            m += 12;
            y--;
        }

        // Calculate intermediate values
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Display the day of the week
        System.out.println("Day of the week: " + d0);
        // Close the Scanner object
        input.close();
    }
}