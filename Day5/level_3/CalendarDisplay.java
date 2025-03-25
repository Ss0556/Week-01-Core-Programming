import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        displayCalendar(month, year);
        
        scanner.close();
    }

    public static void displayCalendar(int month, int year) {
        // Get month name
        String monthName = getMonthName(month);
        
        // Get number of days in month
        int daysInMonth = getDaysInMonth(month, year);
        
        // Get first day of month (0=Sunday, 1=Monday, ..., 6=Saturday)
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Display calendar header
        System.out.println("\n     " + monthName + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        
        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        
        // Print days of month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            
            // Move to next line if Saturday or end of month
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {
            31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust month and year for Zeller's Congruence
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        
        int k = year % 100; // Year of century
        int j = year / 100; // Zero-based century
        
        // Zeller's Congruence algorithm (returns 0=Saturday, 1=Sunday, ..., 6=Friday)
        int dayOfWeek = (1 + 13*(month + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        
        // Convert to 0=Sunday, 1=Monday, ..., 6=Saturday
        return (dayOfWeek + 5) % 7;
    }
}