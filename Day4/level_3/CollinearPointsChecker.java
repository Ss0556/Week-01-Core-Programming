public class CollinearPointsChecker {
    public static void main(String[] args) {
        // Sample points
        double x1 = 2, y1 = 4;
        double x2 = 4, y2 = 6;
        double x3 = 6, y3 = 8;

        // Check collinearity using slope formula
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear by slope formula? " + collinearBySlope);

        // Check collinearity using area of triangle formula
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear by area formula? " + collinearByArea);
    }

    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // Points are collinear if the area is 0
    }
}