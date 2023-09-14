import jdk.jfr.Percentage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final int Percentage = 100;
        final int Months_in_a_year = 12;
        int principal=0;
        float annualInterestRate=0;
        byte years=0;
        float monthlyInterestRate=0;

        Scanner value = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Principal value: ");
            principal = value.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;

            System.out.println("Enter value netween 1000 and 1000000");

        }

        while (true){
                System.out.print("Annual interest: ");
                 annualInterestRate = value.nextFloat();
                monthlyInterestRate = annualInterestRate / Percentage / Months_in_a_year;
                if( annualInterestRate>=0 && annualInterestRate<=30){
                    break;
                }
                 System.out.println("Annual Interest should be between 0 to 30");

        }


            while (true){
            System.out.print("Period(years): ");
            years = value.nextByte();
            if(years>+1 && years<=30) {
                break;
            }
                System.out.println("Enter years between 1 and 30");

            }
            int numberOfPayments = years * Months_in_a_year;

            double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,numberOfPayments)) /
                    ( Math.pow(1 + monthlyInterestRate,numberOfPayments) - 1);

            String mortgageInCurrency = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);


            System.out.println("Your Mortgage is: "+ mortgageInCurrency);






        }

}

