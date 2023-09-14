import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculatorOOPMain {
    final static int percentage = 100;
    final static int Months_in_a_year = 12;
    public static void main(String[] args) {

        int principal=0;
        float annualInterestRate=0;
        byte years=0;
        // float monthlyInterestRate=0;

        //Scanner value = new Scanner(System.in);

        principal = (int) (Console.getValue("Principal: ",1000,1_000_000));
        annualInterestRate= (float) Console.getValue("AnnualInterestRate: ",0,30);
        years= (byte)(Console.getValue("Years: ",1,30));

        double mortgageValue = calculateMortgage(principal,annualInterestRate,years);
        String mortgageInCurrency = NumberFormat.getCurrencyInstance(Locale.US).format(mortgageValue);
        System.out.println("Your Mortgage is: "+ mortgageInCurrency);

        System.out.println();
        System.out.println("The balance left is :");
        for(short months =1 ; months<=years * Months_in_a_year; months++ ){
            double balance =  CalNumberOfPayments(principal,annualInterestRate,years,months);
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(balance));
        }
    }

    public static double CalNumberOfPayments(
            int principal,
            float annualInterestRate,
            byte years,
            short numberOfPaymentsMade
    ){

        float monthlyInterestRate = annualInterestRate / percentage / Months_in_a_year;
        float numberOfPayments = years * Months_in_a_year;

        double balance = principal * ( Math.pow(1 + monthlyInterestRate,numberOfPayments) -
                Math.pow(1 + monthlyInterestRate,numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterestRate,numberOfPayments) - 1);


        return balance;


    }
    public static double calculateMortgage(
            int principal,
            float annualInterestRate,
            byte years){

        float monthlyInterestRate = annualInterestRate / percentage / Months_in_a_year;
        float numberOfPayments = years * Months_in_a_year;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,numberOfPayments)) /
                ( Math.pow(1 + monthlyInterestRate,numberOfPayments) - 1);

        return mortgage;

    }
}



