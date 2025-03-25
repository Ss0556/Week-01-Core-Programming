import java.util.Scanner;

public class FeeDiscountCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total course of fee ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage ");
        double discountPercentage = input.nextDouble();

        double discount = (fee*discountPercentage)/100;
        double finalFee = fee-discount;
     
        System.out.println("The discount amount is INR "+discount);
        System.out.println("and the final discounted fee is INR "+finalFee);

        input.close();  
    }
}
