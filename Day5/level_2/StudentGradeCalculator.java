import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int studentCount = sc.nextInt();
        
        int[][] scores = generateRandomScores(studentCount);
        String[][] gradeReport = generateGradeReport(scores);
        printGradeReport(gradeReport);
        
        sc.close();
    }

    public static int[][] generateRandomScores(int studentCount) {
        int[][] scores = new int[studentCount][3];
        for(int i=0; i<studentCount; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50; // Physics (50-99)
            scores[i][1] = (int)(Math.random() * 50) + 50; // Chemistry
            scores[i][2] = (int)(Math.random() * 50) + 50; // Math
        }
        return scores;
    }

    public static String[][] generateGradeReport(int[][] scores) {
        String[][] report = new String[scores.length][6];
        
        for(int i=0; i<scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            
            report[i][0] = String.valueOf(scores[i][0]); // Physics
            report[i][1] = String.valueOf(scores[i][1]); // Chemistry
            report[i][2] = String.valueOf(scores[i][2]); // Math
            report[i][3] = String.valueOf(total); // Total
            report[i][4] = String.format("%.2f", average); // Average
            report[i][5] = determineGrade(percentage); // Grade
        }
        return report;
    }

    public static String determineGrade(double percentage) {
        if(percentage >= 80) return "A";
        if(percentage >= 70) return "B";
        if(percentage >= 60) return "C";
        if(percentage >= 50) return "D";
        if(percentage >= 40) return "E";
        return "R";
    }

    public static void printGradeReport(String[][] report) {
        System.out.println("\nStudent Score Report");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                         "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Grade");
        
        for(int i=0; i<report.length; i++) {
            System.out.printf("%-10d %-10s %-10s %-10s %-10s %-10s %-10s\n",
                            i+1, report[i][0], report[i][1], report[i][2], 
                            report[i][3], report[i][4], report[i][5]);
        }
    }
}