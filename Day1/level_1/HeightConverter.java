import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in cms ");
        double heightCM = input.nextDouble();

        double cmToInchs = 2.54;
        int inchesInFoot = 12;

        double heightInches = heightCM/cmToInchs;

        int feet = (int) (heightInches/inchesInFoot);
        int inches = (int) (heightInches%inchesInFoot);

        System.out.println("Your height in CM is "+heightCM+" while in feet is "+feet+" and inches is "+inches);

        input.close();
    }
}
