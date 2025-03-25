import java.util.Scanner;

public class TravelRouteLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter fromCity: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter viaCity: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter toCity: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter distance fromToVia (in miles): ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter distance viaToFinalCity (in miles): ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter time taken (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Output the result
        System.out.printf("Name: %s, From: %s, Via: %s, To: %s%n", name, fromCity, viaCity, toCity);
        System.out.printf("Distance fromToVia: %.2f miles, viaToFinalCity: %.2f miles%n", fromToVia, viaToFinalCity);
        System.out.printf("Time taken: %.2f hours%n", timeTaken);

        // Close the scanner
        scanner.close();
    }
}