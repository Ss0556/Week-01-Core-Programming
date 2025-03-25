import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        
        System.out.println("Enter ages of 10 students:");
        for(int i=0; i<10; i++) {
            System.out.print("Student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }
        
        String[][] eligibilityData = checkVotingEligibility(ages);
        printEligibilityTable(eligibilityData);
        
        sc.close();
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for(int i=0; i<ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void printEligibilityTable(String[][] data) {
        System.out.println("\nAge\tEligibility");
        System.out.println("----------------");
        for(String[] row : data) {
            System.out.printf("%s\t%s\n", row[0], row[1]);
        }
    }
}