// This code is completely written by Me(Pratik B) as a part of my practice and revision.
//Importing Scanner utility
import java.util.Scanner;

public class INRCurrencyConverter {
    public static void main(String args[]) {
        //Creating new instance of Scanner
        Scanner sc = new Scanner(System.in);
        //Giving option to user to give Input
        System.out.println("This Currency converter had last updated price record on 27/08/23");
        System.out.println("\n Select from the following currencies to convert INR to : ");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.println("4. INR to CNY");
        System.out.println("5. INR to JPY");
        System.out.println("6. INR to AED");
        
        
        int amount = sc.nextInt();
        // Creating Switch statements for multiple currency Conversion Options
        switch(amount) {
            case 1: {
                System.out.println("Enter the amount in INR: ");
                double toUSD = sc.nextDouble();
                if(toUSD > 0) {
                    System.out.println(toUSD + " INR equals to " + toUSD*0.012 + " USD. ");
                }else{
                    System.out.println("Please Enter the positive denomination of INR. ");
                }
            }
            break;
            case 2: {
                System.out.println("Enter the amount in INR: ");
                double toEUR = sc.nextDouble();
                if(toEUR > 0) {
                    System.out.println(toEUR + " INR equals to " + toEUR*0.011 + " EUR. ");
                }else{
                    System.out.println("Please Enter the positive denomination of INR. ");
                }
            }
            break;
            case 3: {
                System.out.println("Enter the amount in INR: ");
                double toGBP = sc.nextDouble();
                if(toGBP > 0) {
                    System.out.println(toGBP + " INR equals to " + toGBP*0.0096 + " GBP. ");
                }else{
                    System.out.println("Please Enter the positive denomination of INR. ");
                }
            }
            break;
            case 4: {
                System.out.println("Enter the amount in INR: ");
                double toCNY = sc.nextDouble();
                if(toCNY > 0) {
                    System.out.println(toCNY + " INR equals to " + toCNY*0.088 + " CNY. ");
                }else{
                    System.out.println("Please Enter the positive denomination of INR. ");
                }
            }
            break;
            case 5: {
                System.out.println("Enter the amount in INR: ");
                double toJPY = sc.nextDouble();
                if(toJPY > 0) {
                    System.out.println(toJPY + " INR equals to " + toJPY*1.77 + " JPY. ");
                }else{
                    System.out.println("Please Enter the positive denomination of INR. ");
                }
            }
            break;
            case 6: {
                System.out.println("Enter the amount in INR: ");
                double toAED = sc.nextDouble();
                if(toAED > 0) {
                    System.out.println(toAED + " INR equals to " + toAED*0.044 + " AED. ");
                }else{
                    System.out.println("Please Enter the positive denomination of INR. ");
                }
            }
            
        }
        
    }
}
