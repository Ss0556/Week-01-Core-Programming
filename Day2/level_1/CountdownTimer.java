import java.util.Scanner;

public class CountdownTimer {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();
        
        // Use a while loop to count down from the input number to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }
        
        // Close the Scanner object
        input.close();
    }
}