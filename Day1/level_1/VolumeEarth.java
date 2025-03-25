public class VolumeEarth {
    public static void main(String[] args) {
        double radiusKM = 6378;
        double kmToMils = 0.625;

        double volumeKm3 =(4.0/3.0*Math.PI*Math.pow(radiusKM,3));
        double volumeMiles3 = volumeKm3*Math.pow(kmToMils, 3);

        System.out.println("The volume of Earth in cubic kilometeres is "+ volumeKm3+ " and cubic miles is "+ volumeMiles3);
    }
}
