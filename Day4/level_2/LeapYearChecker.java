import java.util.Scanner;

public class LeapYearChecker {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("Invalid year. Please enter a year >= 1582.");
            return;
        }

        // Check if it's a leap year
        boolean isLeapYear = isLeapYear(year);

        // Display result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}