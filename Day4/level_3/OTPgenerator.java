import java.util.HashSet;
import java.util.Random;

public class OTPgenerator {
    public static void main(String[] args) {
        HashSet<Integer> otps = new HashSet<>();
        while (otps.size() < 10) {
            otps.add(generateOTP());
        }
        System.out.println("Generated OTPs: " + otps);
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000; // Random number between 100000 and 999999
    }
}