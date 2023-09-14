public class PalindromeSeries {
    public static void main(String[] argument){
        int i;
        String text ="MaYank";
        String reverseText = "";

        int number= 3443;
        int originalnumber=number;
        int remainder;
        int storeNumber =0;


        for(i=text.length()-1; i>=0; i--){
            reverseText = reverseText + text.charAt(i);
        }

        if(text.toLowerCase().equals(reverseText.toLowerCase())){
            System.out.println("It is a palindrome string");
        }
        else
            System.out.println("Not a palindrome string");

        while(number>0) {
            remainder = (number % 10);
            storeNumber = storeNumber * 10 + remainder;
            number /= 10;
        }

        if (originalnumber == storeNumber){
            System.out.println("It is a palindrome number");
        }
        else
            System.out.println("Not a palindrome number");



    }
}
