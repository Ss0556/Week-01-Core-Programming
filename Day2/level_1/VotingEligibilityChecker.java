import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();
        
        // Check if the person is eligible to vote (age >= 18)
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Close the Scanner object
        input.close();
    }
}