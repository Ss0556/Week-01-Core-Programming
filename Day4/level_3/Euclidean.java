public class Euclidean{
    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] lineEquation = lineEquation(x1, y1, x2, y2);

        System.out.println("Distance: " + distance);
        System.out.println("Line equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }

    // Method to calculate Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find line equation
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }
}