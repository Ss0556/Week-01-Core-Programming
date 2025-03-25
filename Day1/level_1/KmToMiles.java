public class KmToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double converstionFactor = 1.6;

        double miles = kilometers/converstionFactor;

        System.out.println("The distance " + kilometers+ "km in miles is "+ miles);
    }
}
