import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        sc.close();
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);
        System.out.println("\n\t" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int firstDay = getFirstDayOfMonth(month, year);

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); // Right-align the days
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println(); // Move to the next line after Saturday or the last day
            }
        }
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) { // April, June, September, November
            return 30;
        } else { // January, March, May, July, August, October, December
            return 31;
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int y = year;
        int m = month;
        int d = 1; // First day of the month
        int h = (d + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        return (h + 5) % 7; // Adjust to make Sunday = 0, Monday = 1, ..., Saturday = 6
    }
}