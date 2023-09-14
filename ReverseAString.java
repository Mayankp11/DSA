import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] argument){

        //String string = "I am available";
        Scanner string = new Scanner(System.in);
        System.out.print("Enter the words");
        String value = string.nextLine();

        StringBuilder word = new StringBuilder();

       word.append(value);

        word.reverse();
        System.out.println(word);

    }
}
