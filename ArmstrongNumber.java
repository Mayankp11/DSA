public class ArmstrongNumber {
    // a number which is equal to sum of its individual digit cube
    //153 = 1^3 + 5^3 = #^3
    public static void main(String[]argucbskja) {
        int number = 1533333;
        int remainder;
        int value;
        int copiedNumber = number;
        int sum=0;

        while (copiedNumber !=0) {
            remainder = copiedNumber % 10;
            value = (int) Math.pow(remainder, 3);
            sum +=value;
            copiedNumber /= 10;

        }

        if(sum == number){
            System.out.println("It is an Armstrong Number");
        }
        else
            System.out.println("Not an Armstrong number");
    }
}
