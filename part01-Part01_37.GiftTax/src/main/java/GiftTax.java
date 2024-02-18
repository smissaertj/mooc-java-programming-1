
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double gift = Integer.valueOf(scan.nextLine());
        double giftLowerLimit = 0;
        double taxLowerLimit = 0;
        double taxRate = 0;
        
        if (gift < 5000){
            System.out.println("No tax!");
        } else if ( gift >= 5000 && gift < 25000 ) {
            giftLowerLimit = 5000;
            taxLowerLimit = 100;
            taxRate = 0.08;
        } else if ( gift >= 25000 && gift < 55000) {
            giftLowerLimit = 25000;
            taxLowerLimit = 1700;
            taxRate = 0.10;
        } else if ( gift >= 55000 && gift < 200000) {
            giftLowerLimit = 55000;            
            taxLowerLimit = 4700;
            taxRate = 0.12;
        } else if (gift >= 200000 && gift < 1000000) {
            giftLowerLimit = 200000;
            taxLowerLimit = 22100;
            taxRate = 0.15;
        } else {
            giftLowerLimit = 1000000;
            taxLowerLimit = 142100;
            taxRate = 0.17;
        }
        
        calculateTax(gift, giftLowerLimit, taxLowerLimit, taxRate);
    }
    
    public static void calculateTax(double gift, double giftLowerLimit, double taxLowerLimit, double taxRate){
        double taxAmount = taxLowerLimit + (gift - giftLowerLimit) * taxRate;
        System.out.println("Tax: " + taxAmount);
    }
}
