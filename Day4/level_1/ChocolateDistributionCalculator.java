import java.util.Scanner;

public class ChocolateDistributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of chocolates and children
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        // Divide chocolates
        int[] result = findRemainderAndQuotient(chocolates, children);

        // Output the result
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }

    // Method to divide chocolates
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachChildGets, remaining};
    }
}