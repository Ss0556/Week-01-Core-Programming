import java.util.Scanner;

public class ReverseCounter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();
        
        // Use a for loop to count down from the input number to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Close the Scanner object
        input.close();
    }
}