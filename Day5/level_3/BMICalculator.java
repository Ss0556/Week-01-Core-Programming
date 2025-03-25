import java.util.Scanner;

public class BMICalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightData = new double[10][2]; // 10 rows, 2 columns (weight, height)
        
        // Input phase
        System.out.println("Enter the weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            heightWeightData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightData[i][1] = scanner.nextDouble();
        }
        
        // Process data
        String[][] bmiResults = processBMIData(heightWeightData);
        
        // Display results
        displayBMITable(bmiResults);
        
        scanner.close();
    }
    
    public static String[][] processBMIData(double[][] heightWeightData) {
        String[][] results = new String[10][4]; // 10 rows, 4 columns (height, weight, BMI, status)
        
        for (int i = 0; i < heightWeightData.length; i++) {
            double weight = heightWeightData[i][0];
            double height = heightWeightData[i][1];
            
            // Calculate BMI and status
            String[] bmiInfo = calculateBMI(weight, height);
            
            // Store all information
            results[i][0] = String.format("%.1f cm", height);
            results[i][1] = String.format("%.1f kg", weight);
            results[i][2] = bmiInfo[0]; // BMI value
            results[i][3] = bmiInfo[1]; // Status
        }
        
        return results;
    }
    
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100.0;
        
        // Calculate BMI
        double bmiValue = weight / (heightInMeters * heightInMeters);
        String formattedBMI = String.format("%.2f", bmiValue);
        
        // Determine status
        String status;
        if (bmiValue < 18.5) {
            status = "Underweight";
        } else if (bmiValue < 25) {
            status = "Normal";
        } else if (bmiValue < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        return new String[]{formattedBMI, status};
    }
    
    public static void displayBMITable(String[][] bmiData) {
        System.out.println("\nBMI Results for Team Members");
        System.out.println("+------------+------------+------------+------------+");
        System.out.println("| Height     | Weight     | BMI        | Status     |");
        System.out.println("+------------+------------+------------+------------+");
        
        for (String[] row : bmiData) {
            System.out.printf("| %-10s | %-10s | %-10s | %-10s |%n", 
                             row[0], row[1], row[2], row[3]);
        }
        
        System.out.println("+------------+------------+------------+------------+");
    }
}